//        *                  INVERTED&ROTATEDHALF-PYRAMIDpattern
//      * *
//    * * *
//  * * * *
package pattern;
import java.util.*;
public class p2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        int j=1;

        System.out.println("ENTER NUMBER OF ROWS : ");
        int r=sc.nextInt();

        for(i=1 ; i<=r ; i++){
            for(j=1 ; j<=r-i ; j++){
                System.out.print("   ");
            }

            for(j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println();      
        }
    }
}
// package pattern;
// import java.util.*;
// public class p2 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int i=1;
//         int j=1;

//         System.out.println("ENTER NUMBER OF ROWS : ");
//         int r=sc.nextInt();

//         for(i=1 ; i<=r ; i++){
//             for(j=1 ; j<=r-i ; j++){
//                 System.out.print("   ");
//             }

//             for(j=1 ; j<=1 ; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();      
//         }
//     }
// }
