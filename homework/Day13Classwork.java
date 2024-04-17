/*
Day13Classwork       Name: Dylan Wang

Plays around with String methods.
*/
public class Day13Classwork{
   public static void main(String[] args){
      String sentence = "I love Mr. Chiu's intro to Java class!";
      String name = "Dylan";
      
      //assigned methods
      int sentenceLength = sentence.length();
      String sentence3Characters = sentence.substring(0, 4);
      String uppercaseSentence = sentence.toUpperCase();
      
      //selected methods
      String lowercaseSentence = uppercaseSentence.toLowerCase();
      String concatSentence = name.concat(sentence.substring(1, 38));
      String replaceSpace = concatSentence.replace(' ', 'a');
      
      String opinion = concatSentence.substring(0, 10) + "s" + concatSentence.substring(10);
      
      System.out.println("Original: " + sentence);
      System.out.println("\"" + sentence + "\" is " + sentenceLength + " characters long.");
      System.out.println("Edited Sentence 1: " + concatSentence);
      System.out.println("Edited Sentence 2: " + replaceSpace);
      System.out.println("Very true Sentence" + opinion);
   }
}