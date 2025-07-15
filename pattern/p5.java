// *              *    
// *  *        *  *    
// *  *  *  *  *  *
// *  *  *  *  *  *
// *  *        *  *
// *              *
package pattern;
import java.util.*;
public class p5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS : ");
        int rows=sc.nextInt();
        int i=1;
        int j=1;
        for(i=1 ; i<=rows ; i++){
            // stars + space + stars;

            //stars
            for(j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            //space
            for(j=1 ; j<=2*(rows-i) ; j++){
                System.out.print("   ");
            }
            // stars
            for(j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println("   ");
        }
        for(i=rows ; i>=1 ; i--){
            for(j=i ; j>=1 ; j--){
                System.out.print(" * ");
            }
            for(j=2*(rows-i) ; j>=1 ; j--){
                System.out.print("   ");
            }
            for(j=i ; j>=1 ; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
