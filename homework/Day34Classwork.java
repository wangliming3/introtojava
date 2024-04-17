/*
Day34Classwork.java      Author:Dylan Wang

returns sum of integers
*/
import java.util.*;

public class Day34Classwork{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int x = 0;
      
      while (x != 1 || x != 2){
         System.out.println("Select an option (Enter 1, 2 or 3):\n1. Sum of Values\n2. Finding Prime Numbers\n3. Quit");
         x = scan.nextInt();
         
         if (x == 1){
            System.out.println(sumOfValues());
         }else if (x == 2){
            System.out.println(isPrime());
         }else if (x == 3){
            break;
         }else{
            System.out.println("You did not enter 1, 2, or 3. Try again.");
         }
      }
      
   }
   
   public static int sumOfValues(){
      Scanner scan = new Scanner(System.in);
      int res = 0;
      int i;
      int j;
      
      System.out.println("Returning sum of integers between i and j. \n\nEnter integer i:");
      i = scan.nextInt();
      
      
      System.out.println("Enter integer j:");
      j = scan.nextInt();
      res += j;
      
      while(i != j){
         res += i;
         i ++;
         
      }
      return res;
      
   }
   
   public static boolean isPrime(){
      Scanner scan = new Scanner(System.in);
      int res = 0;
      
      System.out.println("\nThis program will check if your integer is prime. \nEnter an integer:");
      int num = scan.nextInt();
      
      int i = 1;
      
      while(i != num){
         if (num % i == 0){
            res ++;
         }
         i++; 
         
      }
      if (res != 0){
         return false;
      }else{
         return true;
      }
   
   }
}