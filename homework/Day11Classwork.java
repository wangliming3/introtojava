/*
Day11Classwork.java        Author: Dylan Wang

Plays around with Math methods.
*/
public class Day11Classwork{
   public static void main(String[] args){
   int variable = 6;
   int variableCubed = (int)Math.pow(variable, 3);
   double variableSqRoot = (double)Math.sqrt(variable);
   
   double pi = 3.14159;
   
   double c = 2*pi*variable;
   double a = (double)Math.pow(pi*variable, 2);
   
   System.out.println(variable + " cubed is " + variableCubed + ".");
   System.out.println("The square root of " + variable + " is " + variableSqRoot + ".");
   System.out.println("The circumference of a circle with radius " + variable + " is " + c + ".");
   System.out.println("The area of a circle with radius " + variable + " is " + a + ".");

   }
}