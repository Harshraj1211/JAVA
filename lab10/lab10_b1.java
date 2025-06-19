// Write a Java program that divides two numbers.  If Num1 or Num2 were not an integer, 
// the program would throw a Number Format Exception. If Num2 were Zero, the program 
// would throw an Arithmetic Exception. Display appropriate message for each exception. 
// [B] 
import java.util.*;

class lab10_b1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try {
            
            System.out.println("Enter A : ");
            int num1=sc.nextInt();
            System.out.println("Enter B : ");
            int num2=sc.nextInt();
            int c=num1/num2;
            System.out.println("Answer : " + c);
            
            
        } 
        catch (ArithmeticException e) {
        System.out.println("Number 2 is zero which is not approprate.");
        }
        catch (InputMismatchException e) {
            System.out.println("Number should be in integer.");
        }
        finally{
            sc.close();
        }

        System.out.println("Program is over.");

    }       
}
