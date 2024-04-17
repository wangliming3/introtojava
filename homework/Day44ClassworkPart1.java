/*
Day44ClassworkPart1.java            Author: Dylan Wang

Char methods
*/
public class Day44ClassworkPart1{
   public static void main(String[] args){
      char char1 = 'a';
      char char2 = 'b';
      
      System.out.println("Sum = " + (char1 + char2) + "\nDifference = " + (char1 - char2));
      //System finds ASCII values of both character and adds/subtracts them from eachother.
      
      System.out.println(char1 + "" + char2);
      
      
      char char3 = 32;
      
      while ((int)char3 <= 126){
         System.out.println(char3);
         char3++;
      
      }
   }
}