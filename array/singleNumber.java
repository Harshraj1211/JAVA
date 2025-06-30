// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
package array;
import java.util.Scanner;
public class singleNumber {
    public static int singleNumber(int[] array,int size){
        int i=0;
        int result=0;
        for (i = 0; i < array.length ; i++) {
            result ^= array[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter Size of the array : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter Elements of the array : ");
        for (int j = 0; j < size ; j++) {
            array[i]=sc.nextInt();
        }

        singleNumber(array,size);
    }
    
}