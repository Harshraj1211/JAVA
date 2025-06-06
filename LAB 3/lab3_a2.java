// A 2 Write a program to check whether a number is even or odd.[A] 
import java.util.*;
public class lab3_a2{
    public static void main(String[] abc){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Number is even.");
        }
        else if(n%2!=0){
            System.out.println("Number is odd.");
        }
        else if(n==0){
            System.out.println("Number is zero.");
        }
    }
}
