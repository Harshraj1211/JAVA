/*
 *                              *               1
 *                              * *             2
 *                              * * *           3
 *                              * * * *         4
 *                              * * *           5   5-2
 *                              * *             6   6-4
 *                              *               7   7-6
 */
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=0;

        System.out.println("Enter size of rows : ");
        int rows=sc.nextInt();

        for ( i = 0; i <rows ; i++) {
            int h=2;
            for(j=0 ; j<=i ; j++){
                if(i==(rows/2)+1){
                    for (int k = 0; k<rows-h ; k++) {
                        System.out.print("   ");
                        h+=2;
                    }
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    
    }
}