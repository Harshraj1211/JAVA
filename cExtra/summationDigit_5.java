// WAP to find a summation of a digit of a given number. (Iterative and recursive) 
package cExtra;
import java.util.*;
public class summationDigit_5 {

    public static int summationDigitIterative(int number){
        int sum = 0;
        while (number!=0) {
            int ld=number%10;
            sum+=ld;
            number/=10;
        }
        return sum;
    }

    public static int summationDigitrecursive(int number){
        if (number==0) {
            return 0;
        }

        return (number%10) + summationDigitrecursive(number/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int iterative = summationDigitIterative(number);
        int recursive = summationDigitrecursive(number);

        System.out.println("Iterative : " + iterative);
        System.out.println("Recursive : " + recursive);
    }
}
