//             *  *  *  *  * 
//          *           * 
//       *           *
//    *           * 
// *  *  *  *  *
package pattern;
import java.util.*;
public class p7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        int j=1;
        System.out.println("ENTER NUMBERS OF ROWS : ");
        int rows=sc.nextInt();
        for(i=1 ; i<=rows ; i++){
            for(j=1 ; j<=rows-i ; j++){
                System.out.print("   ");
            }
            for(j=1 ; j<=rows ; j++){
                
                // System.out.println(" * ");
                if(i==1 || j==1 || i==rows || j==rows){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

