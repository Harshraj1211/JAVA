package pattern;
import java.util.*;
public class p17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of rows : ");
        int rows=sc.nextInt();
        int i=1;
        int j=1;
        int k=1;
        for(i=rows ; i>0 ; i--){
            for(k=1 ; k<=rows-i ; k++){
                System.out.print("   ");
            }
            for(j=1 ; j<=2*i-1 ; j++){
                if(i==1 || i==rows || j==2*i-1)
                    System.out.print(" * ");
            }
            System.out.println();
        }
        for(i=2 ; i<=rows ; i++){

            for(k=1 ; k<=rows-i ; k++){
                System.out.print("   ");
            }
            for(j=1 ; j<=2*i-1 ; j++){
                if(i==1 || i==rows || j==2*i-1)
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}