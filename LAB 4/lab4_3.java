import java.util.*;
public class lab4_3 {
    public static void printarray(int array[],int size){
        int i=0;

        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }

    }
    public static void arrayreversed(int array[],int size){
        int i=0;
        System.out.println("Array after reversed : ");
        for(i=size ; i>0 ; i--){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int i=0;
        int array[]=new int[size];
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array before reversed : ");
        printarray(array,size);
        arrayreversed(array,size);
    }
}