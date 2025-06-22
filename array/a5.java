// binary_serch
package array;
import java.util.*;
public class a5 {
    public static int binary_serch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
        public static void main(String[] args){     

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i=0;
        System.out.println("ENTER ELEMENTS OF THE ARRAY : ");
        for(i=0 ; i<size ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER KYE : ");
        int key=sc.nextInt();
    
        System.out.println("INDEX OF KEY IS "+binary_serch(arr,key));   
    }
}