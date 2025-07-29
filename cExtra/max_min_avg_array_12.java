// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value should 
// be taken from user (Note that you are not allowed to use an array for this) 
package cExtra;
import java.util.*;
public class max_min_avg_array_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers u want to enter : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        int i=0;
        int j=0;
        int k=0;

        System.out.println("Please enter the numbers : ");
        for(i=0 ; i<size; i++){
            System.out.print("Enter number " + (i+1) + " : ");
            array[i]=sc.nextInt();
        }

        int max=array[0];
        int min=array[0];
        int sum=0;

        for(i=0 ; i<size ; i++){
            sum+=array[i];
            if(max<array[i]){
                max=array[i];
            }
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println();
        double avg = sum/size;

        System.out.println("Average is : " + avg);
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
    }
}
