package array;
import java.util.*;
public class a7{
    public static void reverse(int array[],int size){
        int first=0;
        int last=size-1;
        while (first<last){
            int temp=array[last];
            array[last]=array[first];
            array[first]=temp;
            first++;
            last--;

        }
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY : ");
        int size=sc.nextInt();
        int i=0;
        int array[]=new int[size];
        System.out.println("ENTER ELEMENTS OF ARRAY : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        reverse(array,size);
        System.out.println("REVERSED ARRAY : ");
        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }
        }
}