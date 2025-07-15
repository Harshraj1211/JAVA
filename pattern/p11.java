/*
             * 
          *  *  *
       *  *  *  *  *
    *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
 
 */
// package pattern;
// import java.util.*;
// public class p11 {
//     public static void main(String[] abc){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number of rows : ");
//         int rows=sc.nextInt();
//         int i=0;
//         int j=0;
//         int k=0;
//         for(i=1 ; i<=rows ; i++){
//             for(k=1 ; k<=rows-i ; k++){
//                 System.out.print("   ");
//             }
//             for(j=1 ; j<=2*i-1 ; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }
package pattern;
import java.util.*;
public class p11 {
    public static void main(String[] abc){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows=sc.nextInt();
        int i=0;
        int j=0;
        int k=0;
        for(i=1 ; i<=rows ; i++){
            for(k=1 ; k<=rows-i ; k++){
                System.out.print("   ");
            }
            for(j=1 ; j<=2*i-1 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}