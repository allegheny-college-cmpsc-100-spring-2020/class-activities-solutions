package activityfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Creates and plays a word ladder game.
 *
 * @author {GROUP NAMES HERE}
 */
public class WordLadder {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Create identifiers for input
    File file = null;
    Scanner input = null;
    // Read input from file
    try {
      file = new File("../../../../input/words.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    String word = new String();
    String startingWord = input.nextLine();
    word = startingWord.toUpperCase();
    wordLen = word.length();
    System.out.println(word);
    
    // Word ladder, step 1
    word = "P" + word.substring(1,word.length());
    System.out.println(word);
    
    // Word ladder, step 2
    word = word.substring(0,2) + 'L' + word.substring(3,wordLen);
    System.out.println(word);
    
    // Word ladder, step 3
    word = word.substring(0,3) + 'E';
    System.out.println(word);
    
    // Word ladder, step 4
    word = word.substring(0,1) + 'A' + word.substring(2,wordLen);
    System.out.println(word);
    
    // Word ladder step 5
    word = 'S' + word.substring(1,wordLen);
    System.out.println(word);
    
    // Word ladder step 6
    word = word.substring(0,2) + 'G' + word.substring(3,wordLen);
    String finalWord = input.nextLine();
    
    // Final comparison
    System.out.print(word + " = " + finalWord + ": ");
    System.out.print(word.equals(finalWord));
  }
}