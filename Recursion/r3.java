package Recursion;
import java.util.*;
public class r3 {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f1=fact(n-1);
        int f=n*fact(n-1);
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}