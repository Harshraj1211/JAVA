package cExtra;
import java.util.*;
public class armstrong_11 {

    public static int order(int number){
        int lastdigit;
        int length=0;
        while (number!=0){
            length++;
            lastdigit = number%10;
            number/=10;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int temp=number;
        int x = order(number);
        int sum=0;

        int lastdigit=0;
        while (temp!=0) {
            lastdigit = temp%10;
            sum+=Math.pow(lastdigit,x);
            temp/=10;
        }

        temp=number;

        if (sum==temp) {
            System.out.println("Number is Armstrong...");
        }
        else{
            System.out.println("Number is Not Armstrong...");
        }
    }
}