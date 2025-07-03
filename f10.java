// Write a Java program to check if a number is a palindrome in Java? ( 121 is 
// a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse
//  of a number e.g., 121 is 
// a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a 
// palindrome because the reverse of 321 is 123, which is not equal to 321. 
package function;
import java.util.*;
public class f10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int n=sc.nextInt();

        int reverse=0;
        int b=n;
        // lastdigit=n%10;
        while(n>0){
            int lastDigit = n % 10; 
            reverse = reverse * 10 + lastDigit; 
            n /= 10;
        }
        System.out.println("REVERSED NUMBER IS : "+reverse);
    
        if(b==reverse){
            System.out.println("NUMBER IS PALINDROME.");
        }
        else{
            System.out.println("NUMBER IS NOT PELINDROME.");
        }
    }
}
