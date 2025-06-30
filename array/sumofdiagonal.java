package array;
import java.util.*;
public class sumofdiagonal {
    public static void sumofdiagonal(int array[][],int rows,int cols){
        int i=0;
        int j=0;
        int sum=0;
        for(i=0 ; i<rows ; i++){
            for(j=0 ; j<cols ; j++){
                if(i==j){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements of 2D array is : " + sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter number of collums : ");
        int cols=sc.nextInt();
        int array[][]=new int[rows][cols];
        int i=0;
        int j=0;
        System.out.println("Enter Elements of 2D array : ");
        for(i=0 ; i<rows ; i++){
            for(j=0 ; j<cols ; j++){
                array[i][j]=sc.nextInt();
            }
        }
        sumofdiagonal(array,rows,cols);

    }
}
