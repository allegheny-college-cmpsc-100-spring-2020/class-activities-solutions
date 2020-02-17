package activitysix;

import java.util.Scanner;
 
/** Creates an address label.
 *
 * @author Solution Repository
 */

public class AddressLabel {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter building number: ");
    int buildingNum = input.nextInt();
    
    input.nextLine();
    
    System.out.print("Enter street name: ");
    String streetName = input.nextLine();
    
    System.out.print("Enter city: ");
    String cityName = input.nextLine();
    
    System.out.print("Enter two-letter state: ");
    String stateName = input.nextLine();
    
    System.out.print("Enter zip code: ");
    String zipCode = input.nextLine();
     
    System.out.println();
    System.out.println(buildingNum + " " + streetName);
    System.out.println(cityName + ", " + stateName + " " + zipCode);
  }
}