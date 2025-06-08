// B 7 Write a program to find that given number is palindrome or not. [B] 
import java.util.*;
public class lab3_b7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int reversed = 0;
        int og=n;
        while(n>0){
            int lastdigit = n % 10;
            reversed = reversed * 10 + lastdigit;
            n /= 10; 
        }
        System.out.println("Reversed number : " + reversed);
        if(reversed == og){
            System.out.println("Number is palindrome.");
        }
        else if(reversed!=n){
            System.out.println("Number is not palindrome.");
        }
    }
}
// import java.util.*;
// public class lab3_b7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         int original = n; // Store the original number
//         int reversed = 0;
        
//         while (n > 0) {
//             int lastDigit = n % 10;
//             reversed = reversed * 10 + lastDigit;
//             n /= 10;
//         }
        
//         System.out.println("Reversed number : " + reversed);
//         if (reversed == original) { // Compare with the original number
//             System.out.println("Number is palindrome.");
//         } else {
//             System.out.println("Number is not palindrome.");
//         }
//     }
// }
