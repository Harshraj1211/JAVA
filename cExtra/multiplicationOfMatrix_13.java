package cExtra;
import java.util.*;
public class multiplicationOfMatrix_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of rows1 : ");
        int rows1 = sc.nextInt();
        
        System.out.println("Enter size of collum1 : ");
        int cols1= sc.nextInt();

        int[][] array = new int[rows1][cols1];

        int i=0;
        int j=0;

        System.err.println("Please enter elements of the matrix : ");

        for(i=0 ; i<rows1 ; i++){
            for(j=0 ; j<cols1; j++){
                System.out.print("Enter value for Array[" + (i+1) + "][" + (j+1) + "] : " );
                array[i][j]=sc.nextInt();
            }
        }        

        
        System.out.println("Enter size of rows2 : ");
        int rows2 = sc.nextInt();
        
        System.out.println("Enter size of collum2 : ");
        int cols2= sc.nextInt();
        
        int[][] array2 = new int[rows2][cols2];

        System.err.println("Please enter elements of the matrix : ");
        for(i=0 ; i<rows2 ; i++){
            for(j=0 ; j<cols2; j++){
                System.out.print("Enter value for Array[" + (i+1) + "][" + (j+1) + "] : " );
                array2[i][j]=sc.nextInt();
            }
        }        
        
        System.out.println("Matrix 1 : ");
        for(i=0 ; i<rows1 ; i++){
            for(j=0 ; j<cols1; j++){
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 : ");
        for(i=0 ; i<rows2 ; i++){
            for(j=0 ; j<cols2; j++){
                System.out.print(" " + array2[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Multiplication of the both matrix...");
        for(i=0 ; i<rows1 ; i++){
            for(j=0 ; j<cols2 ; j++){
                System.out.print(" " + array[i][j]*array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
