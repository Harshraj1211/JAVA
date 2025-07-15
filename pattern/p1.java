package pattern;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;

        System.out.println("ENTER NUMBET OF ROWS : ");
        int r=sc.nextInt();

        for(i=1 ; i<=r ; i++){
            for(int j=1 ; j<=r ; j++){
                if(i==1 || j==1 || i==r || j==r){
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