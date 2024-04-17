/*
Day6Classwork.java      Name: Dylan Wang


1. Initialize ints a and b with the values 18 and
5. Initialize int c as the difference of a and b.
2. Initialize doubles x and y with the values of
2.4 and 4.1. Initialize double z as the sum of x
and y.
3. Mix and match ints and doubles for
calculations. Play around especially with
division, trying all combinations!
4. Print all results to screen.
5. Leave a comment for any unusual or
unexpected results.
*/
public class Day6Classwork{
   public static void main (String[] args){
      int a = 18;
      int b = 5;
      int c = a + b;
      
      double x = 2.4;
      double y = 4.1;
      double z = x + y;
      
      System.out.println(c + z);
      System.out.println(c / z);
      System.out.println(z / c);
      System.out.println(c % z);
      System.out.println(a/x);
      
      System.out.println((double)Math.pow(b,b+a));
      
   }
}