package activitytwelve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/** Performs various analyses on bags of candies.
 *
 * @author {Your Name Here}
 */
public class BagAnalysis {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up Scanner to read from file
    File file = null;
    Scanner input = null;
    try {
        file = new File("inputs/mm.csv");
        input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.out.println(noFile);
    }

    // Set up integers for loop
    int candyCount;
    int column = 1;

    // Set up objects for loop
    String row;
    Scanner line;
    Bag bag;
    ArrayList<Bag> inventory = new ArrayList<Bag>();

    while(input.hasNextLine()) {
      row = input.nextLine();
      line = new Scanner(row);
      line.useDelimiter(",");
      bag = new Bag();
      while (line.hasNext()) {
        candyCount = line.nextInt();
        switch(column) {
          case 1:
            bag.setColorCount("brown", candyCount);
            break;
          case 2:
            bag.setColorCount("yellow", candyCount);
            break;
          case 3:
            bag.setColorCount("red", candyCount);
            break;
          case 4:
            bag.setColorCount("green", candyCount);
            break;
          case 5:
            bag.setColorCount("orange", candyCount);
            break;
          case 6:
            bag.setColorCount("blue", candyCount);
            break;
          case 7:
            bag.setTotalPieces(candyCount);
            break;
          default:
            break;
        }
        column++;
      }
      inventory.add(bag);
      column = 1;
    }

    while (index < inventory.size()) {
      bag = inventory.get(index); // Remember that each object in the list is a Bag type
      isCorrectTotal = bag.getVerifiedTotal();
      if(!isCorrectTotal) {
        badTotals++;
      }
      index++;
    } // End loop 3

    System.out.println("The percentage of bags with bad totals: " + ((double)badTotals / inventory.size()) * 100 + "%");
  }
}
