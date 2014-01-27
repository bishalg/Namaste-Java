import java.util.Scanner;
/**
 * Write a description of class split here.
 * 
 * Write a program that reads in an integer and breaks it into a sequence of individual  digits. For example the input 1234 is displayed as 1 2 3 4.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class split
{
   public static void main(String args[]) {
      System.out.println("Please enter some text");
      Scanner reader = new Scanner(System.in);                  

      String input = reader.nextLine();
      char[] letters = input.toCharArray();
      
      for (char c : letters) {
          System.out.println(" " + c);
      }
   }
}
