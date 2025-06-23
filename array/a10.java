package array;
import java.util.*;
public class a10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=0;
        System.out.println("Enter Size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        int maxsum=Integer.MIN_VALUE; 
        int currsum=0;
        for(i=0 ; i<size ; i++){
            int start=i;
            for(j=i ; j<size ; j++){
                int end=j;
                currsum=0;
                for(int k=start ; k<=end ; k++){
                    currsum+=array[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("MAX SUM IS : " + maxsum);
    }
}