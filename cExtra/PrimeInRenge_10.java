// WAP to find a prime number between range (range should be entered by user). 
package cExtra;
import java.util.*;
public class PrimeInRenge_10 {
    public static boolean Isprime(int number){
    
        if(number<1){
            return false;
        }
    
        for (int i = 2 ; i < Math.sqrt(number) ; i++) {
            if (number%i==0) {
                    return false;
            }
        }
        return true;
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter starting range : ");
        int start = sc.nextInt();

        System.out.println("Enter ending range : ");
        int end = sc.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end);
        for(int i=start ; i<=end ; i++){
            if (Isprime(i)) {
                System.out.println(i);
            }
        }
        
    }
}
