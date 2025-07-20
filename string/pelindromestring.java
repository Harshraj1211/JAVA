package string;
import java.util.*;
public class pelindromestring {
    public static boolean pelindromestring(String str){
        int i=0;
        for(i=0 ; i<str.length()/2 ; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=sc.nextLine();
        if(pelindromestring(str)){
            System.out.println("String is pelindrome.......");
        }
        else{
            System.out.println("String is not pelindrome.......");
        }
    }
}
