package array;
import java.util.*;
public class a6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ROWS : ");
        int rows=sc.nextInt();
        System.out.println("ENTER SIZE OF COLLUMS : ");
        int col=sc.nextInt();
        int arr[][]=new int[rows][col];
        int i=0;
        int j=0;
        System.out.println("ENTER ELEMENTS OF THE ARRAY : ");
        for(i=0 ; i<rows ; i++){
            for(j=0 ; j<col ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("MATRIX : ");
        for(i=0 ; i<rows ; i++){
            for(j=0 ; j<col ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("ENTER A NUMBER : ");
        int n=sc.nextInt();
        for(i=0 ; i<rows ; i++){
            for(j=0 ; j<col ; j++){
                if(n==arr[i][j]){
                    System.out.println("NUMBER FOUND AT : ("+ i +","+ j +")");
                }
            }
            System.out.println();
        }
    }
}