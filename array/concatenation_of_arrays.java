// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]
package array;
import java.util.Scanner;
public class concatenation_of_arrays {

    public static void output(int[] array,int size) {
        int new_size=size*2;
        int i=0;
        int[] new_array=new int[new_size];

        for(i=0 ; i<size ; i++){
            new_array[i]=array[i];
            new_array[i+size]=array[i];
        }
        for(i=0 ; i<new_size ; i++){

            System.out.println( new_array[i] + ",");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int i=0;
        int[] array=new int[size];
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        output(array,size);
    }
    
}
