package array;
import java.util.*;
public class tribonacci {
    public static int tribonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            int firstterm=0;
            int secondterm=1;
            int thirdterm=1;
            for(int i=0 ; i<=n ; i++){
                int forthterm= firstterm + thirdterm + secondterm;
                firstterm=secondterm;
                secondterm=thirdterm;
                thirdterm=forthterm;
            }
            return firstterm;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("NUMBER : ");
        int n=sc.nextInt();
        System.out.println(tribonacci(n));        
    }
}
