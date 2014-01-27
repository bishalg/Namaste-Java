package readfile;
import java.util.Scanner;

/**
 * Write a description of class Vowels here.
 * 
 * Write a program to input characters from the keyboard and output a table giving numbers of different vowels
 * 
 * @author Bishal  
 * @version 2014-Jan-26
 */
public class Vowels
{    
    public static void main(String arg[]) { 
        String nameInput = "";  // Declare & initialize a String to hold input.
        Scanner reader = new Scanner(System.in); // Decl. & init. a Scanner.
        System.out.print("Input Your Name >");  // Troll asks for name.
        nameInput = reader.nextLine(); // Get what the user types.
        System.out.println();  // Move down to a fresh line.
        // Then say something trollish and use their name.
        char[] letters = nameInput.toCharArray();
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
        
        for (char c : letters) {
            switch (c) {
                case 'a':
                case 'A':
                    aCount++;
                    break;
                case 'e':
                case 'E':
                    eCount++;
                    break;
                case 'i':
                case 'I':
                    iCount++;
                    break;
                case 'o':
                case 'O':
                    oCount++;
                    break;
                case 'u':
                case 'U':
                    uCount++;
                    break;
                default:
            }
        }
        
        System.out.println("a = " + aCount);
        System.out.println("e = " + eCount);
        System.out.println("i = " + iCount);
        System.out.println("o = " + oCount);
        System.out.println("u = " + uCount);
    }
}
