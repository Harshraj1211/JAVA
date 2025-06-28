package array;
import java.util.*;
public class mediantof2array{
    public static void sortarray(int size,int arr[]){
        int i=0;
        int j=0;
        for(i=0 ; i<size ; i++){
            for(j=0 ; j<size-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array : ");
        for(i=0 ; i<size ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void mediantof2array(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int arr3[]=new int[arr1.length + arr2.length];
        int pointer1=0;
        int pointer2=0;
        int pointer3=0;
        while(pointer1<arr1.length || pointer2<arr2.length){
            int value1 = pointer1<arr1.length ? arr1[pointer1] : Integer.MAX_VALUE; 
            int value2 = pointer2<arr2.length ? arr2[pointer2] : Integer.MAX_VALUE; 
            if(value1<value2){
                arr3[pointer3]=value1;
                pointer1++;
            }
            else{
                arr3[pointer3]=value2;
                pointer2++;
            }
            pointer3++;
        }
        System.out.println(arr3);
        // for(i=0 ; i<arr1.length + arr2.length ; i++){
        //     System.out.println(arr3[i]);
        // }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eter size of first array : ");
        int size1=sc.nextInt();
        System.out.println("Enter size of second array : ");
        int size2=sc.nextInt();
        int arr1[]=new int[size1];
        int arr2[]=new int[size2];
        int size3=size1+size2;
        int arr3[]=new int[size3];
        int i=0;
        System.out.println("Enter Elements of array 1 : ");
        for(i=0 ; i<size1 ; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Elements of array 2 : ");
        for(i=0 ; i<size2 ; i++){
            arr2[i]=sc.nextInt();
        }
        sortarray(size1,arr1);
        sortarray(size2,arr2);
        mediantof2array(arr1,arr2);

    }
}