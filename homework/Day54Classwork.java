/*
Day54Classwork.java        Author: Dylan Wang

JOptionPane interview
*/
import javax.swing.JOptionPane;
import java.math.*;

public class Day54Classwork{
   public static void main(String[] args){
      
      int interviewChoice = JOptionPane.showConfirmDialog(null, "Would you like to be interviewed?"); //, "Interview", JOptionPane.QUESTION_MESSAGE);
      
      if (interviewChoice == JOptionPane.YES_OPTION){
         String name = JOptionPane.showInputDialog(null, "What is your name?", "Interview", JOptionPane.QUESTION_MESSAGE);  
         String ageStr = JOptionPane.showInputDialog(null, ("Hello " + name + "!\n" + "How old are you?"), "Interview", JOptionPane.QUESTION_MESSAGE);
         String color = JOptionPane.showInputDialog(null, "What is your favorite color?", "Interview", JOptionPane.QUESTION_MESSAGE);
         String food = JOptionPane.showInputDialog(null, "What is your favorite food?", "Interview", JOptionPane.QUESTION_MESSAGE);
         int myAge = 14;         
         int age = Integer.parseInt(ageStr);
         
         String yearOrYears = (Math.abs(age - myAge) <= 1)? " year": " years"; 
         String olderYounger = (age > myAge)? "you are older than me by " + (age - myAge) + yearOrYears: "you are younger than me by " + (myAge - age) + yearOrYears;
         olderYounger = (age == myAge)? "you are the same age as me": olderYounger;
                                   
         JOptionPane.showMessageDialog(null, ("Based on the information we gathered,\nyour favorite color is " + color + ",\n" + "your favorite food is " + food + ",\n" + "and " + olderYounger + " at " + ageStr + " old.\n\nGoodbye " + name + ", we hope to see you again."), "Interview", JOptionPane.PLAIN_MESSAGE);
         
      }else{
         JOptionPane.showMessageDialog(null, "Okay bye", "Interview", JOptionPane.PLAIN_MESSAGE);
      }
   }
   
   
}