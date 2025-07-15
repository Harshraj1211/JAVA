//             * 
//          *  *  * 
//       *  *  *  *  *
//    *  *  *  *  *  *  *
// *  *  *  *  *  *  *  *  *
//    *  *  *  *  *  *  * 
//       *  *  *  *  *
//          *  *  *
//             *
package pattern;
import java.util.*;
public class p8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        int j=1;
        System.out.println("ENTER NUMBERR OF ROWS : ");
        int rows=sc.nextInt();
        for(i=1 ; i<=rows ; i++){
            for(j=1 ; j<=rows-i ; j++){
                System.out.print("   ");
            }
            for(j=1 ; j<=2*i-1 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(i=rows ; i>=1 ; i--){
            if(i==rows){
                continue;
            }
            for(j=1 ; j<=rows-i ; j++){
                System.out.print("   ");
            }
            for(j=1 ; j<=2*i-1 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
