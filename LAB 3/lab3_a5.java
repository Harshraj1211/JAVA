// A 5 Write a program to check that the given number is prime or not.[A] 
import java.util.*;
public class lab3_a5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int i=1;
        int count=0;
        for(i=1 ; i<=n ; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime number.");
        }
        else{
            System.out.println("not a prime number.");
        }
    }
}