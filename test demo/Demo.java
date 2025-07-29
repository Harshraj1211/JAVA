// import java.util.*;
// public class Demo{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int i=0;
//         int j=0;
//         System.out.println("ENTER NUMBERS OF ROWS : ");
//         double row=sc.nextDouble();
//         System.out.println("ENTER NUMBER OF COLLUMS : ");
//         double col=sc.nextDouble();
//         for(i=1 ; i<=row ; i++){
//             for(j=1 ; j<=col ; j++){
//                 System.out.print("*");
//             }
//             System.out.println("\n");
//         }
//     }

// }
import java.util.*;
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=0;
        System.out.println("ENTER NUMBERS OF ROWS : ");
        double row=sc.nextDouble();
        System.out.println("ENTER NUMBER OF COLLUMS : ");
        double col=sc.nextDouble();
        for(i=1 ; i<=row ; i++){
            for(j=1 ; j<=col ; j++){
                // System.out.print("*");
                if(i==1 || j==1 || i==row || j==col){
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