package function;
import java.util.*;
public class f5 {
    public static void prime(int n){
        int i=2;
        for(i=2 ; i<=n ; i++){
            if(inprime(i)){
                System.out.println("   "+i);
            }
        }
    }
    public static boolean inprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        prime(20);
    }
}