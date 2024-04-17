/* 
Day31Classwork.java        Author: Dylan Wang 

FOR LOOPS! 
*/
import java.util.*;

public class Day31Classwork{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Enter an integer:");
      
      int num = scan.nextInt();
      int res = num;
      
      for (int i = 0; i != num; i++)
      {
         res += i;
      }
      
      System.out.println("The sum of the first " + num + " is " + res);
   
   }
}