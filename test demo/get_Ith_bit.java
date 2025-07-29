import java.util.*;
public class get_Ith_bit {
    public static int get_Ith_bit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a desimal number : ");
        int n=sc.nextInt();
        System.out.println("Enter position : ");
        int i=sc.nextInt();
        System.out.println(get_Ith_bit(n,i));
    }
}
