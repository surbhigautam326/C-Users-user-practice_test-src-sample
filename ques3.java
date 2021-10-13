//String to byteArray

package sample;
import java.util.Arrays;

public class ques3 {

	public static void main(String[] args) {
		String s = "JAVA";
		byte[] byteArray = s.getBytes();
		
		System.out.println("String To Byte: " + Arrays.toString(byteArray));
	}
}  
