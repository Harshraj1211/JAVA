import java.util.*;
public class binomial_coefficient{
    
    public static int fact(int h){
        int i=1;
        int result=1;
        for(i=1 ; i<=h ; i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int n=sc.nextInt();
        System.out.println("ENTER R : ");
        int r=sc.nextInt();

        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nr=fact(n-r);
        
        int bc=fact_n/(fact_r*fact_nr);

        System.out.println(bc);

    }
}