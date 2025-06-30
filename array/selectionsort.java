package array;
import java.util.*;
public class selectionsort{
    public static void selectionsort(int array[],int size){
        int i=0;
        int j=0;
        for(i=0 ; i<size-1 ; i++){
            int monimumposition=i;
            for(j=i+1 ; j<size ; j++){
                if(array[monimumposition]>array[j]){
                    monimumposition=j;
                }   
            }
            // for swap the value.
            int temp=array[monimumposition];
            array[monimumposition]=array[i];
            array[i]=temp;
        }
    }
    public static void printarray(int array[],int size){
        int i=0;
        for(i=0 ; i<size ; i++){
            System.out.println(array[i]+" ");
        }
    }
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
        System.out.println("Array Before sorting : ");
        printarray(array, size);
        selectionsort(array,size);
        System.out.println("Array after sortinh : ");
        printarray(array, size);
    }
}