/*
Day134Classwork.java             Author: Dylan Wang

mult table
*/
public class Day134Classwork{
   public static void main(String[] args){
      int[][] num = new int[10][10];
      
      for (int row = 1; row < num.length; row++){
         for (int col = 1; col < num[0].length; col++){
            num[row][col] = row * col;
         }
      }
      
      for (int row = 0; row < num.length; row++){
         for (int col = 1; col < row + 1; col++){
            System.out.print(num[row][col] + "\t");
         }
         System.out.print("\n");
      }
   }
}