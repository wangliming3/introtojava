/*
Day85Classwork.java        Author: Dylan 

classwork
*/
import java.util.*;

public class Day85Classwork{
   public static void main(String[] args){
      System.out.println(sumRange(3,5));
      System.out.println(sumRange(3.5, 5.5));
      System.out.println(sumRange(3,5,2));
      System.out.println(sumRange(3.5,5.5,2));
   }
   
   public static int sumRange(int a, int b){
      int res = 0;
      for (int i = a; i <= b; i++){
         res += i; 
      }
      return res;
   }
   
   public static int sumRange(double x, double y){
      int res = 0;
      x = Math.ceil(x);
      y = Math.floor(y);
      
      int a = (int)x;
      int b = (int)y;
      
      for (int i = a; i <= b; i++){
         res += i; 
      }
      return res;
   }
   
   public static int sumRange(int a, int b, int n){
      int res = 0;
      for (int i = a; i <= b; i += n){
         res += i; 
      }
      return res;
   }
   
   public static int sumRange(double x, double y, int n){
      int res = 0;
      x = Math.ceil(x);
      y = Math.floor(y);
      
      int a = (int)x;
      int b = (int)y;
      
      for (int i = a; i <= b; i+= n){
         res += i; 
      }
      return res;
   }

}