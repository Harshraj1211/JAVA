package Recursion;
import java.util.*;
public class r2{
    public static void printdecrising(int number){
        if(number==1){
            System.out.println(number);
            return;
        }
        System.out.println(number+" ");
        printdecrising(number-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number=sc.nextInt();
        printdecrising(number);
    }
}