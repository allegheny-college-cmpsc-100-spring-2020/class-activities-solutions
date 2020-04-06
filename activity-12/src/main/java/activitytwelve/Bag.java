package activitytwelve;

public class Bag {

  private int brown;
  private int yellow;
  private int red;
  private int green;
  private int orange;
  private int blue;
  private int total;

  /** Sets the count of a given color in the bag.
   *
   * @param color Candy color
   * @param count Count of that color
   */
  public void setColorCount(String color, int count) {
    switch(color.toLowerCase()) {
      case "brown":
        this.brown = count;
        break;
      case "yellow":
        this.yellow = count;
        break;
      case "red":
        this.red = count;
        break;
      case "green":
        this.green = count;
        break;
      case "orange":
        this.orange = count;
        break;
      case "blue":
        this.blue = count;
        break;
      default:
        System.out.println("Not a valid color!");
        break;
    }
  }
  
  public int getColorCount(String color) {
    int total;
    switch(color.toLowerCase()) {
      case "brown":
        total = this.brown;
        break;
      case "yellow":
        total = this.yellow;
        break;
      case "red":
        total = this.red;
        break;
      case "green":
        total = this.green;
        break;
      case "orange":
        total = this.orange;
        break;
      case "blue":
        total = this.blue;
        break;
      default:
        total = -1;
        System.out.println("Not a valid color!");
        break;
    }
    return total;
  }
  
  public void setTotalPieces(int total) {
    this.total = total;
  }
  
  public int getTotalPieces() {
    return this.brown + this.yellow 
           + this.red + this.green
           + this.orange + this.blue;
  }
  
  public boolean getVerifiedTotal() {
    return getTotalPieces() == this.total;
  }
  
  public String toString() {
    return "This bag contains:\n"
           + this.brown + "\tbrown pieces\n"
           + this.yellow + "\tyellow pieces\n"
           + this.red + "\tred pieces\n"
           + this.green + "\tgreen pieces\n"
           + this.orange + "\torange pieces\n"
           + this.blue + "\tblue pieces\n";
  }
}