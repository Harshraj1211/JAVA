package array;
import java.util.*;
public class removeelement{
    public static int removeelement(int array[],int size,int number){
        int i=0;
        int pointer=0;
        for(i=0 ; i<size ; i++){
            if(array[i]!=number){
                array[pointer]=array[i];
                pointer++;
            }
        }
        return pointer;
    }
    public static void printarray(int array[],int newsize){
        int i=0;
        System.out.println("Array after  Removing the number : ");
        for(i=0 ; i<newsize ; i++){
            System.out.println(array[i]);
        }
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
        System.out.println("Enter the number you want to remove : ");
        int number=sc.nextInt();
        removeelement(array, size,number);
        int newsize=size-1;
        printarray(array,newsize);
    }
}