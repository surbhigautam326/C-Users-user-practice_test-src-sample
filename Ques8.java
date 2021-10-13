//Print last modified time


package sample;
import java.io.File;
import java.util.Date;
public class Ques8{
   public static void main(String args[]) {
      File file = new File("Reademe.txt");
      long lastModified = file.lastModified();
      Date date = new Date(lastModified);
      System.out.println(date);
   }
}