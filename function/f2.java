package function;

import java.util.Scanner;

public class f2 {
    public static int fact(int n){
        int f=1;
        for(int i=1 ; i<=n ; i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nr=fact(n-r);

        int a;

        a=fact(n)/(fact(r)*fact(n-r));

        System.out.println("BIONOMIAL COFICIENT IS : " +a);
    }
}
