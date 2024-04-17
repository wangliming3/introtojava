/* 
Day26ClassworkPart2.java         Author: Dylan Wang

Integer thingy
*/
import java.util.*;

public class Day26ClassworkPart2{
   public static void main(String[] args){
      
   
      Scanner scan = new Scanner(System.in);
      int display;
      
      System.out.println("Enter an integer: ");
      int num1 = scan.nextInt();
      
      System.out.println("Enter another integer: ");
      int num2 = scan.nextInt();
      
      if (num1 > 0 && num1 > 0)
         System.out.println("Both of your numbers are positive!!!");
         
      if (num1 % 2 == 0 || num1 % 2 == 0)
         System.out.println("At least one of your numbers is odd!!!!!!!");
         
      if (!(num1 > 10 || num2 > 10))
         System.out.println("Neither of your numbers are greater than 10!!!");
         
      if ((num1 % 2 == 0 && num2 % 2 != 0) || (num1 % 2 != 0 && num2 % 2 == 0))
         System.out.println("Exactly one of your two numbers is even!!");

      
   }
}