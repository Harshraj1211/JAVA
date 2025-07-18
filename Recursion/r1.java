package Recursion;
// import java.util.*;
// public class r1 {
//     public static void print_1_to_n(int n){
//         if(n==1){
//             System.out.println(n);
//         }
//         else{
//             System.out.println(n*(n-1));
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n=sc.nextInt();

//         print_1_to_n(n);
//     }
// } (a)

// import java.util.Scanner;


import java.util.*;
public class r1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int s=0;
        int i=0;
        int term=a;
        for(i=0 ; i<n ; i++){

            term += b * (int)(Math.pow(2, i));
            System.out.print(term + " ");
        }
        System.out.println();
    }
}