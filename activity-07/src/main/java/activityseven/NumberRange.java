package activityseven;

import java.util.Random;

/** Creates enough dice for a game.
 *
 * @author Solutions Repository
 */
public class NumberRange {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Create Random object
    Random pool = new Random();
    // Generate a random number
    int number = pool.nextInt(6);
    System.out.println(number);
  }
}