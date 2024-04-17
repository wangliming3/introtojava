/*
Day17Classwork.java        Name: Dylan Wang

Introduction of Random class.
*/
import java.util.Scanner;
import java.util.Random;

public class Day17Classwork{
   public static void main(String[] args){
      Scanner scanInt = new Scanner(System.in);
      Scanner scanStr = new Scanner(System.in);
      Random generator = new Random();
      
      System.out.println("Enter an integer: ");
      int indexRandom = scanInt.nextInt();
      
      System.out.println("Generating a random integer between 0 and " + indexRandom + ".\n" + generator.nextInt(indexRandom + 1));
      
      System.out.println("Enter another integer: " );
      int index1 = scanInt.nextInt();
      System.out.println("Enter yet another integer: ");
      int index2 = scanInt.nextInt();
      
      System.out.println("Generating a random integer between " + index1 + " and " + index2 + ".\n" + (generator.nextInt(index1, index2)));
   }
}
