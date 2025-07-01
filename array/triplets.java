// Program to count the number of triplets whose sum is equal to the given value x
package array;
import java.util.*;
public class triplets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter Targate sum : ");
        int targate=sc.nextInt();
        int answer=0;
        int j=0;
        int k=0;
        int midcurrent=0;
        int current=0;
        for(i=0 ; i<size ; i++){
            for(j=i+1 ; j<size ; j++){
                for(k=j+1 ; k<size ; k++){
                    if(array[i] + array[j] + array[k] == targate){
                        answer++;
                    }
                }
            }
        }
        System.out.println("Answer is : "+answer);
    }
}