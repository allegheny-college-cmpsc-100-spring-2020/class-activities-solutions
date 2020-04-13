package activitythirteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MakeLineEqn {
  
  public static void main(String[] args) {
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/points.list");
      input = new Scanner(file);
    } catch(FileNotFoundException noFile) {
      System.exit(0);
    }
    
    Scanner line;
    int[][] points = new int[2][2];
    
    while(input.hasNextLine()) {
      line = new Scanner(input.nextLine());
      line.useDelimiter(",");
      while (line.hasNext()) {
        for (int r = 0 ; r < points.length; r++) {
          for (int c = 0; c < points[r].length; c++) {
            points[r][c] = line.nextInt();
          }
        }
      }
    }
    
    int slopeX = points[1][0] - points[0][0];
    int slopeY = points[1][1] - points[0][1];
    
    double slope = (double)slopeY / slopeX;
    
    System.out.println("y = " + slope + "x + b");
  }
}