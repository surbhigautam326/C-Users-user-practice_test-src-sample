package sample;

import java.io.*;
import java.util.*;

public class Ques10{
	
	public static void main(String args[]) throws FileNotFoundException {
		FileReader f = new FileReader("C:\\Users\\user\\Desktop\\Training folder\\for code use.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextInt()) {
			System.out.println(sc.hasNextLine());
		}
	}

	
}