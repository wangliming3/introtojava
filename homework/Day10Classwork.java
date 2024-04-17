/* 
Day10Classwork.java         Name:Dylan Wang

F to C 
C to F
*/
public class Day10Classwork{
   public static void main(String[] args){
   
   int f = 90;
   double c = 32;
   
   double resultC = (f - 32)*(5.0/9);
   System.out.println(f + " fahrenheit is " + Math.round(resultC)+ " celcius.");
   
   double resultF = (c * (9/5.0)) + 32;
   System.out.println(c + " celcius is " + Math.round(resultF) + " fahrenhiet.");
   }
}