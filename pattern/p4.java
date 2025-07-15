package pattern;
import java.util.*;
public class p4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS : ");
        int row=sc.nextInt();
        System.out.println("ENTER NUMBERS OF COLLUMS : ");
        int col=sc.nextInt();
        int i=1;
        int j=1;
        int a=0;
        for(i=1 ; i<=row ; i++){
            for(j=1 ; j<=i ; j++){
                if((i+j)%2==0){
                    a=1;
                }
                else{
                    a=0;
                }
                System.out.print(" "+a);
            }
            System.out.println();
        }
    }
}
