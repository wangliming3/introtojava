/*
Day19ClassworkPart2.java      Author: Dylan Wang

Detects if an integer is even or odd.
*/
import java.util.Scanner;

public class Day19ClassworkPart2{
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Input a number: ");
   int integer = scan.nextInt();
   
   if (integer % 2 == 0)
      System.out.println("This number is even!!!");
   else 
      System.out.println("This number is odd!!!");
   
   }
}