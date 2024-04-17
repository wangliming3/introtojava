/*
Day29ClassworkPart3.java         Author: Dylan Wang

loop
*/
public class Day29ClassworkPart3{
   public static void main(String[] args){
      
      int num = 0;
      
      while (num < 100){
         System.out.print(num + "\t");
         
         num += 2;
         if (num % 20 == 0)
            System.out.println();
         
      }

   }
}