package sample;

import java.util.Scanner;
public class Ques12 {
   public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("first number: ");
        double num1 = in.nextDouble();
        System.out.print("second number: ");
        double num2 = in.nextDouble();
       System.out.print("third number: ");
        double num3 = in.nextDouble();
        if (num1 < num2 && num2 < num3)
        {
            System.out.println("Numbers are in Increasing order");
        }
        else if (num1 > num2 && num2 > num3)
        {
            System.out.println("Numbers are in Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
