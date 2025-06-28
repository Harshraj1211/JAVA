package array;
import java.util.*;
public class frequency{
    public static void frequency(int n[],int size){
        int i=0;
        int c0=0;
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int c5=0;
        int c6=0;
        int c7=0;
        int c8=0;
        int c9=0;
        for(i=0 ; i<size ; i++){
            if(n[i]==0){
                c0++;
            }
            if(n[i]==1){
                c1++;
            }
            if(n[i]==2){
                c2++;
            }
            if(n[i]==3){
                c3++;
            }
            if(n[i]==4){
                c4++;
            }
            if(n[i]==5){
                c5++;
            }
            if(n[i]==6){
                c6++;
            }
            if(n[i]==7){
                c7++;
            }
            if(n[i]==8){
                c8++;
            }
            if(n[i]==9){
                c9++;
            }
        }
        System.out.println("Frequency of "+ 0 +" is "+c0);
        System.out.println("Frequency of "+ 1 +" is "+c1);
        System.out.println("Frequency of "+ 2 +" is "+c2);
        System.out.println("Frequency of "+ 3 +" is "+c3);
        System.out.println("Frequency of "+ 4 +" is "+c4);
        System.out.println("Frequency of "+ 5 +" is "+c5);
        System.out.println("Frequency of "+ 6 +" is "+c6);
        System.out.println("Frequency of "+ 7 +" is "+c7);
        System.out.println("Frequency of "+ 8 +" is "+c8);
        System.out.println("Frequency of "+ 9 +" is "+c9);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of the elements : ");
        int size=sc.nextInt();
        int n[]=new int[size];
        int i=0;
        System.out.println("Enter elements of the array : ");
        for(i=0 ; i<size ; i++){
            n[i]=sc.nextInt();
        }
        frequency(n,size);
    }
}