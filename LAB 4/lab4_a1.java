// Write a java program to do sum of command line argument passed as 
// two Double numbers.
import java.util.*;
public class lab4_a1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter " + size + " numbers : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        int sum=0;
        for(i=0 ; i<size ; i++){
            sum+=array[i];
        }
        System.out.print("Total sum = " + sum);
    }
}