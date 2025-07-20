package string;
import java.util.*;
public class strings_anagrams{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string : ");
        String s1=sc.nextLine();
        System.out.println("Enter Second string : ");
        String s2=sc.nextLine();
        int i=0;
        int j=0;
        for(i=0 ; i<s1.length() ; i++){
            char ch1=s1.charAt(i);
            for(j=0 ; j<s2.length() ; j++){
                char ch2=s2.charAt(j);
                if(ch1==ch2){
                    System.out.println("Strings are anagrams.");
                }
                else{
                    System.out.println("Strings are not anagrams.");
                }
            }
        }        
    }
}