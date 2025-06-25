// For an array of integers return the first value that is repeating in the array
package array;
import java.util.*;
public class a15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the aray : ");
        int size=sc.nextInt();
        int i=0;
        int j=0;
        int array[]=new int[size];
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Elements of the array is : ");
        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }
        for(i=0 ; i<size ; i++){
            for(j=i+1 ; j<size ; j++){
                if(array[i]==array[j]){
                    System.out.println("the first value that is repeating in the array is : "+array[i]);
                    return;
                }
                else{
                    System.out.println("this array dose not repeat element.");
                    return;
                }
            }
        }
    }

}
