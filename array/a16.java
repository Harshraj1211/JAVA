// Write a program to Find Transpose of a 
// Matrix. What is Transpose? 
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
package array;
import java.util.*;
public class a16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter number of collums : ");
        int cols=sc.nextInt();
        int array[][]=new int[rows][cols];
        System.out.println("Enter Elements of the array : ");
        int i=0;
        int j=0;
        for(i=0 ; i<rows ; i++){
            for(j=0 ; j<cols ; j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix : ");
        for(i=0 ; i<rows ; i++){
            for(j=0 ; j<cols ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of the matrix : ");
        for(j=0 ; j<cols ; j++){
            for(i=0 ; i<rows ; i++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}