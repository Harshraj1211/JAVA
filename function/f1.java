package function;
import java.util.Scanner;
public class f1 {
    public static int fact(int a){
        int f=1;
        for(int i=1 ; i<=a ; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int a=sc.nextInt();
        int c=fact(a);
        System.out.println("FACTORIAL IS : " + c);
    }
}