/*
Day57Classwork.java           Author: Dylan Wang

Decimal formats!
*/
import java.text.*;
import java.util.*;

public class Day57Classwork{

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);   
   
      DecimalFormat fmt1 = new DecimalFormat("#,###.##");
      DecimalFormat fmt2 = new DecimalFormat(".000000");
      DecimalFormat fmt3 = new DecimalFormat("#,#");
      
      DecimalFormat fmtQ1 = new DecimalFormat("###,###,###");
      double q1 = 11302023.11;
      DecimalFormat fmtQ2 = new DecimalFormat("####,####.0000");
      double q2 = 12345678.9;

      System.out.println(fmtQ2.format(q1));
      System.out.println(fmtQ2.format(q2));
      
      double dbl = 22323.349;
      
      NumberFormat fmtQ3 = NumberFormat.getPercentInstance();//puts into percentage
      NumberFormat fmtQ4 = NumberFormat.getCurrencyInstance();//puts into currency amount
      
      System.out.println(fmtQ3.format(dbl));
      System.out.println(fmtQ4.format(dbl));

      
   }
   
}
