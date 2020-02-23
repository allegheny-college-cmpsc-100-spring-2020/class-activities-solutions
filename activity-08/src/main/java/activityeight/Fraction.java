package activityeight;

/** Creates a fraction object.
 *
 * @author Solution Repository
 */
public class Fraction {
  
  private int numer;
  private int denom;
  
  /** Constructor
   *
   * @param numer Numerator
   * @param denom Denominator
   */
  public Fraction(int numer, int denom) {
    this.numer = numer;
    this.denom = denom;
  }
  
  public String toString() {
    return this.numer + "/" + this.denom;
  }
}