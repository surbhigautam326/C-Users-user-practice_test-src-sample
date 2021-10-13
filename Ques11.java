package sample;
import java.util.*;
 
class Ques11
{
    public static void main(String []s)
    {
        int n;
        
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter any integer number: ");
        n=sc.nextInt();
         
        
        if(n>0)
            System.out.println(n + " is Positive no.");
        else if(n<0)
            System.out.println(n + " is negative no.");
        else
            System.out.println("zero.");
         
    }
}