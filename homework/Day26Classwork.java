/*
Day26Classwork.java        Author: Dylan Wang

|| and && 
*/
import java.util.*;

public class Day26Classwork{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter todays temperature (F):");
      
      int temp = scan.nextInt();
      
      if (temp >= 100)
         System.out.println("You should probably stay inside for today...");
         
      else if (temp >= 80 && temp < 100)
         System.out.println("It sure is hot today!");
         
      else if (temp >= 55 && temp < 80)
         System.out.println("The weather sure is nice today!");
         
      else if (temp >= 32 && temp < 55)
         System.out.println("Remember to bring a sweater!");
         
      else
         System.out.println("Its freezing today...");
   
   
   }
}