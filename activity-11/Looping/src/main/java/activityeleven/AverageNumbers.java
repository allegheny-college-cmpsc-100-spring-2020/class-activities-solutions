package activityeleven;

import java.util.Scanner;

public class AverageNumbers {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Initialized variables
    int sum = 0;
    int count = 0;

    int addend;
    String response;
    
    // Do math
    do {
      // Get numbers, do math
      System.out.print("Enter a number to add: ");
      addend = input.nextInt();
      sum += addend;
      count++;
      
      // Move on to next line
      input.nextLine();
      
      // Prompt user to continue
      System.out.print("Enter another number (y/n)? ");
      response = input.nextLine().toUpperCase();
    } while (!response.equals("N"));

    // Print sum
    System.out.println("The sum of the numbers is: " + sum);
    System.out.println("Their average is: " + (double)sum/count);
  }
}