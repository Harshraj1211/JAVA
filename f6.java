package function;
import java.util.*;
public class f6 {
    public static void bin_to_desi(int n){
        int desimal=0;
        int pow=0;
        while(n>0){
            int lastdigit=n%10;
            desimal = desimal + lastdigit*(int)(Math.pow(2,pow));
            pow++;
            n/=10;
        }
        System.out.println(desimal);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BINARY NUMBER : ");
        int n=sc.nextInt();
        bin_to_desi(n);
    }
}