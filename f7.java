package function;
import java.util.*;
public class f7 {
    public static void desi_to_bin(int n){
        int pow=0;
        int binary=0;
        while(n>0){
            int rememberence=0;
            rememberence=n%2;
            binary+=rememberence*(Math.pow(10, pow));
            pow++;
            n/=2;
        }
        System.out.println(binary);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DESIMAL NUMBERS : ");
        int n=sc.nextInt();
        desi_to_bin(n);
    }
}
