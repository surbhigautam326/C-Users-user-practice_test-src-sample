package sample;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ques9 {
     public static void main(String [ ] args) throws FileNotFoundException {
              new Ques9().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("C:\\Users\\user\\Desktop\\Training folder\\for code use.txt"));


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }

       }
         System.out.println("\n"+longest_word+"\n");
            return longest_word;
            }
}
   