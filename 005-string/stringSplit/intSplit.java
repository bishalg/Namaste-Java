import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class intSplit here.
 * 
 * Write a program that reads in an integer and breaks it into a sequence of individual  digits. For example the input 1234 is displayed as 1 2 3 4.
 * 
 * @author Bishal Ghimire 
 * @version 2014 - Jan - 26
 */
public class intSplit
{
   public static void main(String args[]) {
      System.out.println("Please enter integer number ");
      Scanner reader = new Scanner(System.in);                  

      int num = reader.nextInt();
      ArrayList<Integer> values = new ArrayList<Integer>();
      int counter = 0;
      //    will display 5 4 3 2 1        
      //       while (num != 0) {
          //           int reminder = num % 10;
          //           System.out.println(" " + reminder);
          //           num = num / 10;
          //       }
     
   while (num > 0) {
       values.add(counter, num%10);
       num = num / 10;
   }
   System.out.println(" " + values);
}
}
