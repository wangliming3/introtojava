/*
Day133Classwork.java       Author: Dylan Wang

iofaodajoji
*/
public class Day133Classwork{
   public static void main(String[] args){
      String[][] stars = new String[8000][600];
      
      for (int row = 0; row < stars.length; row++){
         for (int col = 0; col < stars[0].length; col++){
            stars[row][col] = "* ";
         }
      }
      
      for (int row = 0; row < stars.length; row++){
         for (int col = 0; col < stars[0].length; col++){
            System.out.print(stars[row][col]);
         }
         System.out.print("\n");
      }
   }
}