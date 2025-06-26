// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]
// Explanation: The array ans is built as follows: 
// ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//     = [0,1,2,4,5,3]
package array;

import java.util.*;

public class build_arr_from_permutation {
    public static void output(int[] array, int size) {
        int i = 0;
        int[] ans=new int[size];
        for (i = 0; i < size; i++) {
            ans[i] = array[array[i]];
        }
        System.out.println("output : ");
        for (i = 0; i < size; i++) {
            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        int i = 0;
        int[] array = new int[size];
        System.out.println("Enter Elements of the array : ");
        for (i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        output(array, size);
    }
}
