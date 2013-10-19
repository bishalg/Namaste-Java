package filterArray;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;  // For using Random function
import javax.swing.*;

/**
 * Java to find the largest and the smallest of n numbers stored in array, where n is a positive number
 * 
 * @author (Bishal Ghimire) 
 * @version (1.0 2013-Oct)
 */
public class LargeNSmallNumber extends Applet
{
    // instance variable array
    private int array[] = new int[10];
    private JTextArea textAreaOutput = new JTextArea(5, 15);
    private StringBuilder stringBuilder = new StringBuilder();
    
    /**
     * Constructor for objects of class LargeNSmallNumber
     */
    public LargeNSmallNumber()
    {
        // initialise instance variables
        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = this.randInt(10,1000);
        }
        // Display Random Numbers
        Label labelTitle = new Label();
        //labelTitle.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        labelTitle.setText("Random Numbers :");
        this.add(labelTitle);
        for (int i = 0 ; i < array.length; i++ ) {
           stringBuilder.append(String.valueOf(array[i]));
           stringBuilder.append("\n");
           textAreaOutput.setText(stringBuilder.toString());
        }
        this.add(textAreaOutput);

        JLabel labelMaxNumber = new JLabel();
        labelMaxNumber.setText("Max :");
        this.add(labelMaxNumber);
        
        JLabel labelMaxNumberValue = new JLabel();
        labelMaxNumberValue.setText(String.valueOf(getMaxValue(array)));
        this.add(labelMaxNumberValue);
        
        JLabel labelMinNumber = new JLabel();
        labelMinNumber.setText("Min :");
        this.add(labelMinNumber);
        
        JLabel labelMinNumberValue = new JLabel();
        labelMinNumberValue.setText(String.valueOf(getMinValue(array)));
        this.add(labelMinNumberValue);
    }
    
    /**
     * Method - to find max or min value.
     * 
     * @param  array   a parameter for a array to be passed
     * @return     the max or min value 
    */
    // getting the maximum value
    public static int getMaxValue(int[] array) 
    {  
        int maxValue = array[0];  
        for(int i=1;i < array.length;i++) {  
            if(array[i] > maxValue) {  
                maxValue = array[i];  
            }     
        }  
        return maxValue;  
    }  

    // getting the miniumum value
    public static int getMinValue(int[] array) 
        {  
            int minValue = array[0];  
            for(int i=1;i<array.length;i++) {  
                if(array[i] < minValue) {  
                    minValue = array[i];  
                }  
            }  
            return minValue;  
    }
        
    /**
     * Returns a psuedo-random number between min and max, inclusive.
     * The difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
         *
         * @param min Minimim value
         * @param max Maximim value.  Must be greater than min.
         * @return Integer between min and max, inclusive.
         * @see java.util.Random#nextInt(int)
         */
    public static int randInt(int min, int max) 
    {
        // Usually this can be a field rather than a method variable
        Random rand = new Random();
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
