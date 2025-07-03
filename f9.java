//  Write a method named isEven that accepts an int argument. The method should return true if
//  the argument is even, or false otherwise. Also write a program to test 
//  your method. 
package function;
import java.util.*;
public class f9 {
    
    public static void isEven(int n){
        if(n%2==0){
            System.out.println("TRUE.");
        }
        else{
            System.out.println("FALSE.");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int n=sc.nextInt();

        isEven(n);
    }
}