package array;
import java.util.*;
public class a8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        int j=0;
        for(i=0 ; i<size ; i++){
            int current=array[i];
            for(j=i+1 ; j<size ; j++){
                System.out.print(" ( " + current + " , " + array[j] + " ) ");
            }
            System.out.println();
        }
    }
}
