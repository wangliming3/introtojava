/*jdasjisajid
Day115Classwork.java              Author: Dylan Wang

dwaokfoaosjj LOOPS W ARRAUS
*/
import java.util.*;

public class Day115Classwork{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      int sequence[] = new int[14];
      
      for (int i = 0; i != 14; i++){
         sequence[i] = i*5;
      }
      
      int n = scan.nextInt();
      String res = "(";
      for (int i = 0; i != n; i ++){
         res+= (i != n-1)? sequence[i] + ", ": sequence[i];
      }
      res+= ")";
      System.out.println(res);
      
      
   }

}