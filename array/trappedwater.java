package array;
import java.util.*;
public class trappedwater {
    public static int trappedwater(int height[],int size){
        int i=0;
        int leftmax[]=new int[size];
        int rightmax[]=new int[size];
        leftmax[0]=height[0];
        rightmax[size-1]=height[size-1];
        // for left max=max(array[i],left[i-1]);
        // for right max=max(array[i],right[i+1]);
        System.out.println("Left max height is : ");
        for(i=1 ; i<size ; i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
            System.out.println(leftmax[i]);
        }
        System.out.println("Right max height is : ");
        for(i=size-2 ; i>=0 ; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
            System.out.println(rightmax[i]);
        }
        int trappedwater=0;
        int waterlevel=0;
        for(i=0 ; i<size ; i++){
            waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        System.out.println(" Area of Trapped water is : " );
        return trappedwater;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int height[]=new int[size];
        int i=0;
        System.out.println("Enter height of the all bars : ");
        for(i=0 ; i<size ; i++){
            height[i]=sc.nextInt();
        }
        System.out.println(trappedwater(height,size));

    }
}