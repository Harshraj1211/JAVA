// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive) 
package cExtra;

import java.util.*;

public class fibonacci_7 {
    public static int fiboRecursive(int number) {
        if (number <= 1) {
            return number;
        }
        return fiboRecursive(number - 1) + fiboRecursive(number - 2);
    }

    public static void fibbonacciIterative(int number) {
        System.out.print("Fibonacci Series (Iterative): \n");

        int temp;
        int a = 0, b = 1;
        for (int i = 0; i < number; i++) {
            System.out.println(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void fiboRecursiveSerise(int number) {
        int i = 0;
        System.out.print("Fibonacci Series (Recursive): \n");

        for (i = 0; i < number; i++) {
            System.out.println(fiboRecursive(i) + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println();
        fibbonacciIterative(number);
        fiboRecursiveSerise(number);

    }
}
