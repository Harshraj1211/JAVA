package array;
import java.util.*;
public class a2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("EMTER SIZE OF ARRAY : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("ENTER ELEMENTS OF ARRAY : ");
        for(int i=0 ; i<size ; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0 ; i<size ; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            else if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("MAXIMUM : "+max+"\nMINIMUM : "+min);
    }
}
