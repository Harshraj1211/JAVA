//   * 
//  * * 
// * * * 
//  * * 
//   *
import java.util.*;
public class lab5_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        int i=0;
        int j=0;
        int k=0;
        for(i=1 ; i<=n ; i++){
            for(j=1 ; j<=n-i ; j++){
                System.out.print("   ");
            }
            for(j=1 ; j<=2*i-1 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
            
        }
        for(i=n-1 ; i>0 ; i--){
            for(j=1 ; j<=n-i ; j++){
                System.out.print("   ");
            }
            for(j=1 ; j<=2*i-1 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
            
        }
    }
}