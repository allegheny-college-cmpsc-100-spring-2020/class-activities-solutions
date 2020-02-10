package activityfour;

/** Converts temperatures from Kelvin to Celsius, Celsius to Farenheit.
 *
 * @author {Your Name Here}
 */
public class SomeCalculations {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Solve our math problem
    int answer = 6 / 2 * (1 + 2) - 1;
    System.out.println(answer);
    
    // Solve our temperature problem
    double kelvin = 275.15;
    double celsius = kelvin - 273.15;
    double farenheit = 9.0/5 * celsius + 32;
    System.out.println(farenheit);
    
   /*
    * Find out if today's temperature (in celsius) is comfortable
    * for gators or if they're dormant!
    */
    double highTemp = 10.5; // High temperature in Celsius
    double tempInF = 5.0/9 * highTemp - 32;
    System.out.println(tempInF > 55.0);
  }
}