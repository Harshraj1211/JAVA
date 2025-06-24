package array;
import java.util.*;
public class a11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int currentsum=0;
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int prefix[]=new int[size];
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Normal array : ");
        for(i=1 ; i<size ; i++){
            System.out.println(array[i]);
        }
        prefix[0]=array[0];
        System.out.println("Prefix array : ");
        for(i=0 ; i<size ; i++){

            prefix[i]=array[i]+prefix[i-1];
            // System.out.println(prefix[i]);
        }
        int maxsum=0;
        for(i=0 ; i<size ; i++){
            int start=i;
            for(int j=0 ; j<size ; j++){
                int end=i;
                currentsum= start==0 ? prefix[end] : prefix[start] - prefix[start-1];
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
            }
        }
        System.out.println("Max sum of the sub array : "+maxsum);
    }
}
