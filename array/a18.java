// There is an integer array nums sorted in ascending order (with distinct 
// values). Prior to being passed to your function, nums is possibly rotated at an 
// unknown pivot index k (1 <= k < nums.length) such that the resulting array 
// is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0
// indexed). For example, [0,1,2,4,5,6,7] might 
// be 
// rotated at 
// index 3 and become [4,5,6,7,0,1,2]. 
// pivot
//  Given the array nums after the possible rotation and an integer target, return 
// the index of target if it is in nums, or -1 if it is not in nums. 
// You must write an algorithm with O(log n) runtime complexity. 
// Example 1: 
// Input: 
// nums = [4, 5, 6, 7, 0, 1, 2], target = 0 
// Output:  4 
// Example 2: 
// Input: 
// nums = [4, 5, 6, 7, 0, 1, 2], target = 3 
// Output: -1 
package array;
import java.util.*;
public class a18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array : ");
        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }
        System.out.println("Enter Targate : ");
        int targate=sc.nextInt();
 
        for(i=0 ; i<size ; i++){
            if(targate==array[i]){
                System.out.println(" "+array[i]);
                break;
            }
            else{
                System.out.println("-1");
                break;
            }
        }
    }
}