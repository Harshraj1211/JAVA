// 8 WAP to find a total odd and total even digit of a given number. 
package cExtra;
import java.util.*;
public class FindCountoddEven_inDigit_8 {
    public static void oddEven(int number){
        
        int countEven=0;
        int countOdd=0;

        while (number!=0) {
            int ld = number%10;
            if (ld%2==0) {
                countEven++;        
            }
            else{
                countOdd++;
            }
            number/=10;
        }

        System.out.println("Even Count : " + countEven);
        System.out.println("Odd Count : " + countOdd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        oddEven(number);
    }
}
