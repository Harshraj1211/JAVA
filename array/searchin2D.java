package array;
import java.util.*;
public class searchin2D{
    public static void searchin2D(int array[][],int rows,int cols,int search){
        int i=0;
        int j=0;
        for(i=0 ; i<rows ; i++){
            for(j=0 ; j<cols ; j++){
                if(search!=array[i][j]){
                    
                }
                else{
                    System.out.println(search + " Found at row="+i+"and col="+j);
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=0;
        System.out.println("Enter number of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter number of colums : ");
        int cols=sc.nextInt();
        int array[][]=new int[rows][cols];     
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<rows ; i++){
            for(j=0 ; j<cols ; j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter an Element you won't to search in to the array : ");
        int search=sc.nextInt();
        searchin2D(array,rows,cols,search);
    }
}
