// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
package pattern;
import java.util.*;
public class p3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        int j=1;
        int a=1;
        System.out.println("ENTER NUMBER OF ROWS : ");
        int rows=sc.nextInt();
        System.out.println("ENTER NUMBER OF COLLUMS : ");
        int col=sc.nextInt();
        System.out.println("HERE IS THE PATTERN : ");
        for(i=1 ; i<=rows ; i++){
            for(j=1 ; j<=i ; j++){
                System.out.print(" "+a );
                a++;
            }
            System.out.println();
        }

    }
}