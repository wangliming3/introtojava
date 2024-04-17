/*
Day113Classwork.java       Author: Dylan Wang

arrays!
*/
public class Day113Classwork{
   public static void main(String[] args){
      //int a[] = new int[]; error: array dimension missing
      
      //int a[] = new int[10];
      //System.out.println(a[10]);out of bounds error
      
      int a1[] = {1, 3, 4, 5};
      int a2[] = {2, 4, 5, 6};
      int a3[] = new int[4];
      
      for(int i = 0; i != 4; i++){
         a3[i] = a1[i] + a2[i];
      }
      
      
      int a4[] = {2, 1, 3};
      int a5[] = {7, -1, 0};
      
      double distance = 0; 
      
      for (int i = a4.length - 1; i >= 0; i --){
         distance += (a4[i] - a5[i]) * (a4[i] - a5[i]);
      }
      distance = Math.sqrt(distance);
      
      System.out.println(distance);
   }
}