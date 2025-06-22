package array;
import java.util.*;
public class a1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i=0;
        System.out.println("ENTER ELEMENTS OF THE ARRAY : ");
        for(i=0 ; i<size ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER A NUMBER YOU WONT TO FIND IN TO THE ARRAY : ");
        int h=sc.nextInt();
        System.out.println("ELEMENTS OF ARRAY IS : ");
        for(i=0 ; i<size ; i++){
            System.out.println(arr[i]);
        }
        for(i=0 ; i<size ; i++){
            if(h==arr[i]){
                System.out.println("NUMBER "+h+"IS LOCATED AT "+arr[i]);
            }
        }
    }
}
