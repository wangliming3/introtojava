/*
Day19ClassworkPart3.java      Author: Dylan Wang

Password!!
*/
import java.util.Scanner;

public class Day19ClassworkPart3{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);

      System.out.println("Create a username: ");
      String password = scan.next();
      
      if (password.length() <= 6)
         System.out.println("The username must be more than 6 characters");
         
      else if (password.charAt(0) != 'U')
         System.out.println("The username must start with \"U\"");
         
      else
         System.out.println("Username created!");

   }
}