/*
Day135Classwork.java          Author: Dylan Wang

matrics lol
*/
import java.util.*;

public class Day135Classwork{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.print("Pls enter columns in matrics: ");
      int row = scan.nextInt();
      System.out.print("Pls enter rows in matrics: ");
      int col = scan.nextInt();
   
      int[][] arr1 = new int[row][col];
      int[][] arr2 = new int[row][col];
      
      for (int rowi = 0; rowi < arr1.length; rowi++){
         for (int coli = 0; coli < arr1[0].length; coli++){
            System.out.print("enter first[" + rowi + "][" + coli + "]: ");
            arr1[rowi][coli] = scan.nextInt();
         }
      }
      
      for (int rowi = 0; rowi < arr1.length; rowi++){
         for (int coli = 0; coli < arr1[0].length; coli++){
            System.out.print("enter second[" + rowi + "][" + coli + "]: ");
            arr2[rowi][coli] = scan.nextInt();
         }
      }
      
      System.out.println("First Matrix: \n");
      print2dArray(arr1);
      
      System.out.println("Second Matrix: \n");
      print2dArray(arr2);
      
      System.out.println("\nSum of Matrices:\n");
      print2dArray(sum(arr1, arr2));
   }
   
   public static void print2dArray(int[][] matrix){
      for (int rowi = 0; rowi < matrix.length; rowi++){
         for (int coli = 0; coli < matrix[0].length; coli++){
            System.out.print(matrix[rowi][coli] + "\t");
         }
         System.out.println();
      }
   }
   
   public static int[][] sum(int[][] first, int[][] second){
      int[][] res = new int[first.length][first[0].length];
      
      for (int rowi = 0; rowi < res.length; rowi++){
         for (int coli = 0; coli < res[0].length; coli++){
            res[rowi][coli] = first[rowi][coli] + second[rowi][coli];
         }
      }
      
      return res;
   }
}