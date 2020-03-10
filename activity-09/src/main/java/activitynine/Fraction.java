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
  
  /** Adds a fraction with the same denom.
   *
   * @param addend Fraction to add
   */
  public void add(Fraction addend) {
    this.numer += addend.getNumer();
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
  
  /** Divides a fraction by this instance.
   *
   * @param divisor Fraction to divide
   */
  public void divide(Fraction divisor) {
    Fraction reciprocal = divisor.getReciprocal();
    this.multiply(reciprocal);
  }
  
  /** Creates the reciprocal of a fraction.
   *
   * @param fraction Fraction which to reciprocate.
   */
  private Fraction getReciprocal() {
    return new Fraction(this.denom,this.numer);
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
