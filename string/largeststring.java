package string;
import java.util.*;
public class largeststring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int size=sc.nextInt();
        String str[]=new String[size];
        int i=0;
        System.out.println("Enter strings : ");
        for(i=0 ; i<size ; i++){
            str[i]=sc.nextLine();
        }
        String largest=str[0];
        for(i=0 ; i<size ; i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println("Largest string is : " + largest);
    }
}