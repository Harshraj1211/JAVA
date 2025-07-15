// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
package pattern;
import java.util.*;
public class p13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        int j=1;
        System.out.println("Enter number of rows : ");
        int rows=sc.nextInt();
        for(i=1 ; i<=rows ; i++){
            for(j=1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
