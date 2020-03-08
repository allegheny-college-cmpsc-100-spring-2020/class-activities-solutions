package activityten;

import java.util.Scanner;

/** Tells our gripping tale.
 *
 * @author Solutions Repository
 */
public class CatnapCaper {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Does Alice defect [true/false]: ");
    boolean alice = input.nextBoolean();
    
    System.out.println();
    
    if (alice) {
      System.out.println("Alice defects!");
    } else {
      System.out.println("Alice stays quiet.");
    }
    
    System.out.print("Does Bob defect [true/false]: ");
    boolean bob = input.nextBoolean();
    
    System.out.println();
    
    if (bob) {
      System.out.println("Bob defects!");
    } else {
      System.out.println("Bob stays quiet.");
    }
    
    int aliceSentence = 0;
    int bobSentence = 0;
    
    if (alice && !bob) {
      bobSentence += 3;
    } else if (!alice && bob) {
      aliceSentence += 3;
    } else if (!alice && !bob) {
      aliceSentence += 2;
      bobSentence += 2;
    } else {
      bobSentence += 1;
      aliceSentence += 1;
    }
    
    if (aliceSentence == 0 || bobSentence == 0) {
      System.out.println("And they catnap again!");
    } else {
      System.out.println("Maybe they'll catnap again one day, but not for now...");
    }
  }
}