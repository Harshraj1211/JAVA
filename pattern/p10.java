/*
         *  space=8 row=1 when rows = 5 then k=2*rows-2
       * *  space=6
     * * *  space=4
   * * * *  space=2
 * * * * *  space=0
 */
package pattern;
import java.util.Scanner;;
public class p10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows=sc.nextInt();
        int i=0;
        int j=0;
        int k=0;
        for(i=1 ; i<=rows ; i++){
            for(k=1 ; k<=(rows-i) ; k++){
                System.out.print("   ");
            }
            for(j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }    
}