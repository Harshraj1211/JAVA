// 2 WAP to find whether string is palindrome or not. 
package cExtra;
import java.util.*;
public class StringPelindrome_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String : ");
        String s1=sc.nextLine();

        String s2 = "";

        int i=0;

        for(i=s1.length()-1 ; i>=0 ; i--){
            s2 = s2 + s1.charAt(i);
        }

        System.out.println("Revers String : " + s2);

        if (s1.equals(s2)) {
            System.out.println("Given String is Pelindrome...");
        }
        else{
            System.out.println("String is not Pelindrome...");
        }

    }
}
