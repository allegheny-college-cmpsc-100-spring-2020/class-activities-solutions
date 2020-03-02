package activitynine;

/** Implements a Fraction type.
 *
 * @author {Your Name Here}
 */
public class Fraction {
  
  // Instance variables
  private int numer;
  private int denom;
  
  /** Constructor.
   *
   * @param numer Numerator
   * @param denom Denominator
   */
  public Fraction(int numer, int denom) {
    this.numer = numer;
    this.denom = denom;
  }
  
  /** Sets the numerator of the fraction.
   *
   * @param value The value to set
   */
  public void setNumer(int value) {
    this.numer = value;
  }
  
  /** Sets the denominator of the fraction.
   *
   * @param value The value to set
   */
  public void setDenom(int value) {
    this.denom = value;
  }
  
  /** Retrieves the numerator as int.
   *
   */
  public int getNumer() {
    return this.numer;
  }
  
  /** Retrieves the denominator as int.
   *
   */
  public int getDenom() {
    return this.denom;
  }
  
  /** Subtracts a fraction with same denom.
   *
   * @param subtrahend Fraction to subtract
   */
  public void subtract(Fraction subtrahend) {
    this.numer -= subtrahend.getNumer();
  }
  
  /** Multiplies a fraction with this instance.
   *
   * @param multiplier Fraction to mulitply
   */
  public void multiply(Fraction multiplier) {
    this.numer *= multiplier.getNumer();
    this.denom *= multiplier.getDenom();
  }
  
  /** Gets the value of the fraction in decimal form.
   *
   */
  public double getDecimalValue() {
    return (double)this.numer / this.denom;
  }
  
  /** Provide String object representation.
   *
   */
  public String toString() {
    return this.numer + "/" + this.denom;
  }
}