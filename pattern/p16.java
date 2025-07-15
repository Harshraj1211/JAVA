// *  *  *  *       1,1 1,2 1,3 1,4
// *  *  *          2,1 2,2 2,3
// *  * 
// * 
// *  * 
// *  *  * 
// *  *  *  * 
package pattern;
import java.util.*;
public class p16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for rows : ");
        int rows=sc.nextInt();
        int i=1;
        int j=1;
        int k=1;
        for(i=1 ; i<=rows ; i++){
            for(j=1 ; j<=rows-i+1 ; j++){
                
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(i=2 ; i<=rows ; i++){
            for(j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}