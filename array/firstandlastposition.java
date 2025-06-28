package array;
import java.util.*;
public class firstandlastposition {
    public static void takeinputofarray(int[] array,int size) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
    }
    public static void bubbleshort(int[] array,int size){
        int i=0;
        int j=0;
        for(i=0 ; i<size-1 ; i++){
            for(j=0 ; j<size-1-i ; j++){
                if(array[j]>array[j+1]){
                    array[j]=array[j]^array[j+1];
                    array[j+1]=array[j]^array[j+1];
                    array[j]=array[j]^array[j+1];
                }
            }
        }
    }
    public static void printarray(int[] array,int size) {
        int i=0;
        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }
    }
    public static void firstandlastposition(int[] array,int size,int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("First occurrence : " + first);
        System.out.println("Last occurrence : " + last);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        
        int array[]=new int[size];

        takeinputofarray(array,size);
        System.out.println("Enter targate : ");
        int target=sc.nextInt();
        bubbleshort(array,size);
        System.out.println("Array after shorting : ");
        printarray(array,size);
        firstandlastposition(array,size,target);

    }
}