// A 4 Write a program to find maximum no from given 3 no.(without if-else).[A] 
import java.util.*;
public class lab3_a4{
    public static void main(String[] abcd){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        System.out.println("Enter third number : ");
        int c=sc.nextInt();
        int max=(a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("Maximum numbr is : " + max);    
    }
}