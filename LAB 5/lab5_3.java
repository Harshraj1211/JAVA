import java.util.*;
public class lab5_3 {
    public static void findtargate(int array[],int size,int targate){
        int i=0;
        for(i=0 ; i<size ; i++){
            if(targate==array[i]){
                System.out.println("Index of the Targate is " + i);
            }
        }
    }
    public static void printarray(int array[],int size){
        int i=0;
        System.out.println("Array : ");
        for(i=0 ; i<size ; i++){
            System.out.print("   " + array[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the number you won't to enter in to the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        printarray(array,size);
        System.out.println("Enter Targate : ");
        int targate=sc.nextInt();
        findtargate(array,size,targate);
    }    
}
