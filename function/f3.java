package function;
import java.util.*;
public class f3 {
    public static int sum(int a,int b){
        return a+b;
    } 
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println(sum(5,7));
        System.out.println(sum(5,8,10));
    }
}
// package function;
// import java.util.*;

// public class f3 {
//     public static int sum(int a, int b) {
//         return a + b;
//     } 

//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println(sum(5, 7));    // Prints the sum of 5 and 7
//         System.out.println(sum(5, 8, 10)); // Prints the sum of 5, 8, and 10
//     }
// }