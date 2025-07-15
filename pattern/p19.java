/*
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4 
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 */
package pattern;
import java.util.*;
public class p19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int size=sc.nextInt();
        int i=0;
        int j=0;
        int maxvaluetoprint=size/2+1;
        for(i=0 ; i<size ; i++){
            for(j=0 ; j<size ; j++){
                if(i==1 || i==size-1 && j==1 || j==size-1){
                    System.out.print(" " + maxvaluetoprint + " ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}

