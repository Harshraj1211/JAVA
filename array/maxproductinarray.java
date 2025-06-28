package array;
import java.util.*;
public class maxproductinarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        int j=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array : ");
        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }
        int max=array[0];
        for(i=0 ; i<size ; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("Maximum number of the array is : "+max);
        int secondmax=array[0];
        for(i=0 ; i<size ; i++){
            if(secondmax<array[i] && max>array[i]){
                secondmax=array[i];
            }
        }
        System.out.println("Max is : " + max + "\nSecond Max : " + secondmax);
        int answer=(max-1)*(secondmax-1);
        System.out.println("Max Product : " + answer);
    }
}
