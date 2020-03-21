package activityten;

import java.util.Scanner;

/** Creates a seasonal calendar.
 *
 * @author Solutions Repository
 */
public class SeasonalCalendar {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a numeric month (1-12): ");
    int monthNum = input.nextInt();
    
    System.out.print("Enter a day (1-31): ");
    int day = input.nextInt();
    
    String monthStr = new String();
    String seasonStr = new String();
    
    switch(monthNum) {
      case 1:
        monthStr = "January";
        seasonStr = "Winter";
        break;
      case 2:
        monthStr = "February";
        seasonStr = "Winter";
        break;
      case 3:
        monthStr = "March";
        if (day >= 20) {
          seasonStr = "Spring";
        } else {
          seasonStr = "Winter";
        }
        break;
      case 4:
        monthStr = "April";
        seasonStr = "Spring";
        break;
      case 5:
        monthStr = "May";
        seasonStr = "Spring";
        break;
      case 6:
        monthStr = "June";
        if (day >= 20) {
          seasonStr = "Summer";
        } else {
          seasonStr = "Spring";
        }
        break;
      case 7:
        monthStr = "July";
        seasonStr = "Summer";
        break;
      case 8:
        monthStr = "August";
        seasonStr = "Summer";
        break;
      case 9:
        monthStr = "September";
        if (day >= 22) {
          seasonStr = "Autumn";
        } else {
          seasonStr = "Summer";
        }
        break;
      case 10:
        monthStr = "October";
        seasonStr = "Autumn";
        break;
      case 11:
        monthStr = "November";
        seasonStr = "Autumn";
        break;
      case 12:
        monthStr = "December";
        if (day >= 21) {
          seasonStr = "Winter";
        } else {
          seasonStr = "Autumn";
        }
        break;
      default:
        System.out.println("Invalid entry!");
        System.exit(0);
    }
    
    System.out.println(day + " " + monthStr + " 2020 is in " + seasonStr);
  }
}