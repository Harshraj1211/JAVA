import java.util.*;
public class Fact {
    public static int fact(int a){
        int i=1;
        int result=1;
        for(i=1 ; i<=a ; i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A : "); 
        int a=sc.nextInt();
        int b=fact(a);
        System.out.print("FACTORIAL OF GIVEN NUMBER IS : ");
        System.out.println(fact(a));
    }
}
