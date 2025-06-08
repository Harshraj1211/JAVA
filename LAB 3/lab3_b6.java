// B 6 Write a program to check whether a year is leap year or not.[B] 
import java.util.*;
public class lab3_b6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year=sc.nextInt();
        if(year%400==0 && year%100!=0 || year%4==0){
            System.out.println("leap year.");
        }
        else{
            System.out.println("not a leap year.");
        }
    }
}
