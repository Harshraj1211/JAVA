// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
package array;
import java.util.*;
public class addTwoNumbers {
    public static void add(int[] array1,int size1,int[] array2,int size2) {
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of the first array : ");
        int size1=sc.nextInt();

        int array1[]=new int[size1];

        int i=0;

        System.out.println("Enter Elements of the first array : ");

        for(i=0 ; i<size1 ; i++){
            array1[i]=sc.nextInt();
        }

        System.out.println("Enter size of the second array : ");
        int size2=sc.nextInt();

        int array2[]=new int[size2];

        System.out.println("Enter Elements of the second array : ");

        for(i=0 ; i<size2 ; i++){
            array2[i]=sc.nextInt();
        }
        add(array1,size1,array2,size2);
    }
}
