// linear search in renge.
package array;
import java.util.*;
public class searchInRenge {
    public static void linearsearch(int size,int[] array, int start,int end,int target){
        int i=0;
        if(size==0){
            System.out.println("Invelid Size. please enter size.");
        }
        for(i=start ; i<end ; i++){
            System.out.println("target fount at index : " + i);
            break;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();

        int[] array=new int[size];
        int i=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("(Note - Enter index only)");
        System.out.println("Enter your range starts with : ");
        int start=sc.nextInt();
        System.out.println("Enter your range ends with : ");
        int end=sc.nextInt();

        System.out.println("Enter Targate : ");
        int target=sc.nextInt();

        linearsearch(size,array,start,end,target);

    }
}
