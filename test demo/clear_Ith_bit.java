import java.util.*;

import array.removeelement;
public class clear_Ith_bit {
    public static int clear_Ith_bit(int n,int i){
        int bitmask=~(1<<i);
        return (n & bitmask);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Desimal number : ");
        int n=sc.nextInt();
        System.out.println("Enter the bit index : ");
        int i=sc.nextInt();
        System.out.println(clear_Ith_bit(n, i));
    }
}
