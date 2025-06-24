// Program to find a unique number in a given array
// n the list [1, 2, 2, 3, 4], the unique numbers are 1, 3, and 4.
package array;
import java.util.*;
public class a13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Elements of the array is : ");
        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }
        int j=0;
        int a=array[0];
        for(i=0 ; i<size ; i++){
            for(j=i+1 ; j<size ; j++){
                if(array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;    
                }
            }
        }
        System.out.println("Unique element is : ");
        int answer=-1;
        for(i=0 ; i<size ; i++){
            if(array[i]!=-1){
                answer=array[i];
            }
        }
        System.out.println(answer);
    }   
}
