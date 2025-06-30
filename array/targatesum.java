// given an array of integers and an integer targate
// return 2 numbers such that add up to targate from tha array
// you may assume that each input would have exactly solution,
// and may not use the same element twice.
package array;
import java.util.*;
public class targatesum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int index[]=new int[2];
        int i=0;
        int j=0;
        System.out.println("Enter Elements : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter targate sum : ");
        int targate=sc.nextInt();
        for(i=0 ; i<size ; i++){
            for(j=i+1 ; j<size ; j++){
                if(array[i]+array[j]==targate){
                    index[0]=i;
                    index[1]=j;
                    // System.out.println("[index : " + index[0] + " , index : " + index[1] + "]");
                    //if thay say that print all the possible index then this Statement will be exicuted.
                }
            }
        }
        System.out.println("[index : " + index[0] + " , index : " + index[1] + "]");
    }
}