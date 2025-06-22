// Question 1: Given an integer array nums, return true if any value appears at least twice in 
// the array, and return false if every element is distinct. 
// Example 1: 
// Input: 
// nums = [1, 2, 3, 
// 1] Output: true 
// Example 2: 
// Input: 
// nums = [1, 2, 3, 
// 4] Output: false 
// Example 3: 
// Input: 
// nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] 
// Output:  true 
package array;
import java.util.*;
public class a4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i=0;
        for(i=0 ; i<size ; i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(i=0 ; i<size ; i++){
            if(arr[i]==arr[i-1]){
                System.out.println("true.");
                break;
            }
            else{
                System.out.println("false.");
                break;
            }
        }
    }
}
