// *  *  *  *  * 
// *  *  *  * 
// *  *  *
// *  *
// *
package pattern;
import java.util.*;
public class p9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        System.out.println("ENTER VALUE OF ROWS : ");
        int rows=sc.nextInt();
        for(i=1 ; i<=rows ; i++){
            for(j=1 ; j<=rows-i+1 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
