// Program to find the second-largest element in the given array
package array;
import java.util.*;
public class a14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        int max=array[0];
        for(i=0 ; i<size ; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("Maximum number of the array is : "+max);
        int second_max=array[0];
        for(i=0 ; i<size ; i++){
            if(second_max<array[i] && max>array[i]){
                second_max=array[i];
            }
        }
        System.out.println("Second maximum number of the array is : "+second_max);
    }    
}