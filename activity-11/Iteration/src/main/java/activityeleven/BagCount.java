package activityeleven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BagCount {

  public static void main(String[] args) {
    
    // Create Scanner to read file
    Scanner input = null;
    File file = null;
    try {
      file = new File("inputs/mm.csv");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    // Set up additional data
    Scanner line = null;
    String bag = new String();
    int value;
    int column;
    
    // Print headers
    System.out.println("Blue\tYellow\tRed\tGreen\tOrange\tBlue\tTotal");
    
    // Iterate on bag
    while (input.hasNextLine()) {
      
      // Get line from file
      bag = input.nextLine();
      
      // Read line from file
      line = new Scanner(bag);
      line.useDelimiter(",");
      column = 1;
  
      // Iterate on line
      while (line.hasNext()) {
        value = line.nextInt();
        switch (column) {
          case 7:
            System.out.println(value);
            break;
          default:
            System.out.print(value + "\t");
        }
        column++;
      }
    }
  }
}