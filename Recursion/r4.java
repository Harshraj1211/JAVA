package Recursion;
import java.util.*;
public class r4 {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum_n1=sum(n-1);
        int sum=n+sum(n-1);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Sum of 1 to " + n + " number is : " + sum(n));
    }
}
