/*
Day19ClassworkPart1.java         Author: Dylan Wang

Detects if an inputed number is divisible by 3.
*/
import java.util.Scanner;

public class Day19ClassworkPart1{
   public static void main(String[] args){
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Input any integer: ");
   
   int integer = scan.nextInt();
   
   if (integer % 3 == 0)
      System.out.println("This number is divisible by 3!!!!!");
   else 
      System.out.println("This number is NOT divisible by 3!! :(");
   
   }
}