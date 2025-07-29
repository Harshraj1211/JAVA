// Print a following pattern 
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
package cExtra;
import java.util.*;
public class numberPattern_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number of rows : ");
        int rows=sc.nextInt();

        int i,j;
        for(i=1 ; i<=rows ; i++){
            for(j=1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
