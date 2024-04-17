/*
Day15Classwork.java        Author: Dylan Wang

Plays aoud with Scanners!
*/ 

import java.util.Scanner;


public class Day15Classwork{
   public static void main(String[] args){
      Scanner scanStr = new Scanner(System.in);
      Scanner scanInt = new Scanner(System.in);
      
      int integer = scanInt.nextInt();
      double intSqRt = Math.sqrt(integer);
      int intAbs = Math.abs(integer);
      
      System.out.println("Original Integer: " + integer);
      System.out.println("Square Root of Integer: " + intSqRt);
      System.out.println("Absolute Value of Integer: " + intAbs);
      
      
      String str = scanStr.nextLine();
      int strLen = str.length();
      String strLast6 = str.substring(strLen - 6);
      
      System.out.println("Original String: " + str);
      System.out.println("Length of String: " + strLen);
      System.out.println("Last 6 Characters of String: " + strLast6);
     
   }
}