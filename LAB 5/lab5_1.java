// Write an interactive program to print a string entered in a pyramid form. For instance, 
// the string "stream" has to be displayed as follows:[
// s 
// st 
// str 
// stre 
// strea 
// stream 
import java.util.*;
public class lab5_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        int j=0;
        for(i=1 ; i<=s.length() ; i++){
            
                System.out.println(s.substring(0,i));
            
            
        }
    }
}