// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
// 0 1 0 1 0 1
package pattern;
import java.util.*;
public class p15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of Rows : ");
        int rows=sc.nextInt();
        int i=1;
        int j=1;

        for(i=1 ; i<=rows ; i++){
            for(j=1 ; j<=i ; j++){
                if((i+j)%2==0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
