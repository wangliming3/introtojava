/* 
Day31ClassworkPart2.java         Author: Dylan Wang

Largest num.
*/
import java.util.*;

public class Day31ClassworkPart2{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
    
      int i = -5;  
      int res = 0;
      
      int count = 0;
      
      while (i != -1){
         count ++;
         
         System.out.println("Enter a postive integer (enter -1 to quit):");
         i = scan.nextInt();
         
         if (res < i)
            res = i;
            
      }
      
      if (count != 1)
         System.out.println("The greatest number of which you entered is " + res + ".");
      else
         System.out.println("You did not enter a number.");
   
   }
}