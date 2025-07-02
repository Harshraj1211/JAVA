package function;
import java.util.*;
public class f4 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            
        System.out.print("ANSWER IN INTEGER IS : ");
        System.out.println(sum(5,5));

        System.out.println("ANSWER IN FLOAT IS : ");
        System.out.println(sum(5.5f,5.5f));
    }
}
