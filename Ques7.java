//print number of vowels in string

package sample;
import java.util.Scanner;

public class Ques7 {
		
    public static void main(String[] args){
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the string ");
		        String str1 = sc.nextLine();
		 
		        System.out.print("Number of  Vowels in string: " + count(str1)+"\n");
		         }
		        public static  int count(String str1)  {
		        int count = 0;
		        for (int i = 0; i < str1.length(); i++)
		        {
		            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i'
		                    || str1.charAt(i) == 'o' || str1.charAt(i) == 'u')
		            {
		                count++;
		            }
		        }
		        return count;
		    }
}
	


