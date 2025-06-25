// Given an integer array nums, return true if any value appears at least twice in 
// the array, and return false if every element is distinct. 
package array;
import java.util.*;
public class a17 {
    public static boolean containsDuplicate(int array[], int size){
        for(int i=0 ; i<size-1 ; i++){
            for(int j=i+1 ; j<size-1 ; j++){
                if(array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
    }
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
        System.out.println(containsDuplicate(array,size));
    }    
}
