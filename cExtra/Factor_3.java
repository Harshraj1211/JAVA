// 3 WAP to find a Factor of a given number (iterative and recursive) 
package cExtra;
import java.util.*;
public class Factor_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
        System.out.println("Enter a number : ");

        int num=sc.nextInt();
        for(int i=1 ; i<=num ; i++){
            if(num%i==0){
                System.out.println("factor : " + i);
            }
        }
        sc.close();
    }
}
