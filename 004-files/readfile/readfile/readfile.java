package readfile;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; 
import java.io.*;

/**
 * class readfile read file from command line and display its content.
 * 
 * @author (Bishal Ghimire) 
 * @version (1.0 2013-Oct)
 * http://www.mkyong.com/java/how-to-read-file-in-java-fileinputstream/
 */
public class readfile
{
    public static void main(String[] args)
    {
        File file = new File("/Volumes/Backup/namasteJava.txt");
        FileInputStream fileInputStream = null;
        
        //Scanner scanner = new Scanner(System.in);
        System.out.println("*** Program to read file ***");
        try {
            fileInputStream = new FileInputStream(file);
            System.out.println("Total file size to read (in bytes) : "
                    + fileInputStream.available());
            int content;
            while ((content = fileInputStream.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }
        }
        catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
		    try{
		        if (fileInputStream != null)
					fileInputStream.close();
			}
			catch (IOException ep){
			    
			}
        }
    }
}
