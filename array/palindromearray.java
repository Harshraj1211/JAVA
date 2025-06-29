package array;
import java.util.*;
public class palindromearray {
    public static void arrayreversed(int array[],int size){
        int i=0;
        int start=0;
        int end=size-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed array : ");
        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }
    }
    public static boolean ispelindrome(int array[],int size){
        int start=0;
        int end=size-1;
        while (start<end){
            if(array[start]!=array[end]){
                return false;
            }
            start++;
            end--;      
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        arrayreversed(array,size);
        if(ispelindrome(array, size)){
            System.out.println("Array is palindrome.");
        }
        else{
            System.out.println("Array is not palindrome.");
        }
    }
}