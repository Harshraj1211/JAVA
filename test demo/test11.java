// Implement java program to print factorial of a given number using function. This 
// program should run until user enters -1 to exit (e.g. 5! =5*4*3*2*1).
import java.util.*;
public class test11 {
    public static int fact(int a){
        int ans=0;
        int i=0;

        for(i=a ; i>0 ; i--){
            a*=i;
        }

        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter a number : ");
            a=sc.nextInt();
            System.out.println(fact(a));
        }
        while(a!=-1);
    }
}