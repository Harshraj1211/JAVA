package array;
import java.util.Scanner;
public class ceilingofarray {
    public static void bubbleShort(int array[],int size){
        int i=0;
        int j=0;
        for(i=0 ; i<size-1 ; i++){
            for(j=0 ; j<size-i-1 ; j++){
                if(array[j]>array[j+1]){
                    array[j]=array[j]^array[j+1];
                    array[j+1]=array[j]^array[j+1];
                    array[j]=array[j]^array[j+1];
                }
            }
        }
    }
    public static void printArray(int array[],int size){
        int i=0;
        System.out.println("Array after shorting : ");
        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }
    }
    public static void ceilingOfArray(int array[], int size, int target) {
        for (int i = 0; i < size; i++) {
            if (array[i] >= target) {
                System.out.println("Ceiling of " + target + " is " + array[i]);
                break;
            }
            else{
                System.out.println("No ceiling found for " + target);
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter targate : ");
        int targate=sc.nextInt();
        bubbleShort(array,size);
        printArray(array,size);
        ceilingOfArray(array,size,targate);
    }
}
