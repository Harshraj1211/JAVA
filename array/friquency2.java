package array;
import java.util.*;
public class friquency2 {
    public static void frequency2(int array[],int size,int remove){
        int i=0;
        int index=0;
        int array2[]=new int[size-1];
        for(i=0 ; i<size ; i++){
            if(remove!=array[i]){
                array2[index++]=array[i];
            }
        }
        System.out.println("After deleting element : ");
        for(i=0 ; i<index ; i++){
            System.out.println(array2[i]);
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
        System.out.println("Enter a number from the array you won't to remove : ");
        int remove=sc.nextInt();
        frequency2(array,size,remove);
    }
}
