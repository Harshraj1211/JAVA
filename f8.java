// Write a Java method to compute the average of three numbers.. 
package function;
import java.util.*;
public class f8 {
    public static void avg(int a,int b,int c){
        int sum=0;
        sum = a + b + c;
        int average=0;
        average=sum/3;
        // return average;
        System.out.println(average);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER : ");
        int a=sc.nextInt();
        System.out.print("ENTER SECOND NUMBER : ");
        int b=sc.nextInt();
        System.out.print("ENTER THIRD NUMBER : ");
        int c=sc.nextInt();

        avg(a,b,c);

    }
}
