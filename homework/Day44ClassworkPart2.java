/*
Day44ClassworkPart2.java         Author: Dylan Wang

which ASCII comes first
*/

import java.util.*;

public class Day44ClassworkPart2{
   public static void main(String[] args){
      Scanner scan1 = new Scanner(System.in);
      Scanner scan2 = new Scanner(System.in);
      String str1;
      String str2;
      
      System.out.println("Enter a sentence:");
      str1 = scan1.nextLine();
      System.out.println("Enter another sentence:");
      str2 = scan2.nextLine();
      
      System.out.println(whichComesFirst(str1, str2));
      
   }
   
   
   public static String whichComesFirst(String str1, String str2){
      String res;
      
      if (str1.compareTo(str2) < 0 ){
         res = str1;
  
      } else if (str1.compareTo(str2) > 0){
         res = str2;
         
      } else{
         return "Your strings are the same.";
         
      }
      return ("\"" + res + "\" is the larger string, based on its ASCII values.");
   }
}