//1 WAP to find a sum of even number into 1D array. 
package cExtra;
import java.util.*;
public class Evensumin1Darr_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        
        int i=0;
        for(i=0 ; i<size ; i++){
            System.out.println("Enter Element " + (i+1) + " :");
            array[i] = sc.nextInt();
        }

        int sum=0;
        for(i=0 ; i<size ; i++){
            if(array[i]%2==0){
                sum+=array[i];
            }
        }
        System.out.println("Sum : " + sum);
    }
}