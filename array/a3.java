// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.
package array;
import java.util.*;
public class a3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF THE ARRAY : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("ENTER ELEMENTS OF THE ARRAY : ");
        for(int i=0 ; i<size ; i++){
            arr[i]=sc.nextInt();
        }        
        int max=arr[0];
        for(int i=0 ; i<size ; i++){
            if(max<arr[i]){
                int temp=max;
                max=arr[i];
                arr[i]=temp;
                System.out.println(arr[i]);                
            }
        }
    }
}
