// C 8 Write a program to print prime numbers between given range. [C] 
import java.util.*;
public class lab3_c8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        for(int i=2 ; i<=n ; i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isprime(int n){
        int i=1;
        if(n<2){
            return false;
        }
        for(i=2 ; i<=Math.sqrt(n) ; i++){

            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}