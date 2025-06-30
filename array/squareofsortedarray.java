package array;
import java.util.*;
public class squareofsortedarray{
    public static void shortarray(int array[],int size){
        int i=0;
        int j=0;
        for(i=0 ; i<size-1 ; i++){
            for(j=0 ; j<size-i-1 ; j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void squareofsortedarray(int array[],int size){
        int i=0;
        for(i=0 ; i<size ; i++){
            array[i]=array[i]*array[i];
        }
    }
    public static void printarray(int array[],int size){
        int i=0;

        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size= ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        squareofsortedarray(array,size);
        System.out.println("Array before shorting : ");
        printarray(array,size);
        shortarray(array,size);
        System.out.println("Array after shorting : ");
        printarray(array,size);
    }
}
