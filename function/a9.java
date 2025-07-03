package array;
import java.util.*;
public class a9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter elements of array : ");
        int i=0;
        int j=0;
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        int total_subarrays=0;
        System.out.println("Pairs of the array is : ");
        for(i=0 ; i<size ; i++){
            int start=i;
            for(j=i ; j<size ; j++){
                int end=j;
                for(int k=start ; k<=end ; k++){
                    System.out.print(array[k] + " ");
                }
                total_subarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays of the array is : " + total_subarrays);
    }
}