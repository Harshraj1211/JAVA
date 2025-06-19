// Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds 
// Exception using try-catch block. 
import java.util.Scanner;

public class lab10_a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        
        System.out.println("Enter B : ");
        int b = sc.nextInt();
        
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        
        try {
            int c = a / b;
            System.out.println("Result of A / B: " + c);
        
        } catch (ArithmeticException e) {
            System.out.println("Just ignore it, it is arithmetic Exception.");
        }
        
        try {
            int[] array = new int[size];
            System.out.println("Enter 3 Elements.");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("Enter index number : ");
            int index=sc.nextInt();

            System.out.println("number : " + array[index]);

        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Just ignore it, it is ArrayIndexOutOfBoundsException Exception.");
        }
        
        System.out.println("Program is Done.......");
    }
}