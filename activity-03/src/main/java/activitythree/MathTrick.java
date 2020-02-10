package activitythree;

/** Implements a poem in Java with one mistake.
 *
 * @author {Your Name Here}
 */
public class MathTrick {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up numbers
    int cardA  = 8;
    int cardB = 7;
    int workingTotal;
    // Perform the "trick"
    workingTotal = cardB * 2;
    workingTotal = workingTotal + 2;
    workingTotal = workingTotal * 5;
    workingTotal = workingTotal - (10 - cardA);
    // Set up our message
    String message = "Your \"friendship number is\": \t" + workingTotal;
    System.out.println(message);
    System.out.print("(The original cards were: \t" + cardB + cardA + ")");
  }
}