package gcd;

// http://java67.blogspot.com/2012/08/java-program-to-find-gcd-of-two-numbers.html
// http://rosettacode.org/wiki/Greatest_common_divisor
// http://stackoverflow.com/a/19473088/1294448

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;  // For using Random function
import javax.swing.*;

/**
 * Java Consol ap to find greatest common divisor GCD of two number
 * 
 * @author Bishal Ghimire  
 * @version (1.0 2013-Oct)
 */
public class gcdExample
{
    public static void main(String args[]) {
     
        //Enter two number whose GCD needs to be calculated.      
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Program to find GCD of two numbers ***");
        System.out.println("Enter First number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
      
        System.out.println("GCD of two numbers " + number1 +" and " 
                           + number2 +" is :" + findGCD(number1,number2));
    }
    
     /*
     * Java method to find GCD of two number using Euclid's method
     * @return GDC of two numbers in Java
     */
    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0) return number1;
        if(number1 == 0) return number2;
        if(number1 > number2) return findGCD(number2, number1 % number2);
        return findGCD(number1, number2 % number1);
    }
    
    /*
     * Other Methods
     * http://stackoverflow.com/a/19473088/1294448
     * Iterative

public static long gcd(long a, long b){
   long factor= Math.max(a, b);
   for(long loop= factor;loop > 1;loop--){
      if(a % loop == 0 && b % loop == 0){
         return loop;
      }
   }
   return 1;
}
Iterative Euclid's Algorithm

public static int gcd(int a, int b) //valid for positive integers.
{
    while(b > 0)
    {
        int c = a % b;
        a = b;
        b = c;
    }
    return a;
}
Optimized Iterative

static int gcd(int a,int b)
    {
        int min=a>b?b:a,max=a+b-min, div=min;
        for(int i=1;i<min;div=min/++i)
            if(max%div==0)
                return div;
        return 1;
    }
Recursive

public static long gcd(long a, long b){
   if(a == 0) return b;
   if(b == 0) return a;
   if(a > b) return gcd(b, a % b);
   return gcd(a, b % a);
}
Built-in

import java.math.BigInteger;

public static long gcd(long a, long b){
   return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
}
     */
}
