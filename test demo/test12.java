// Implement a Java program to create a method that takes a string as input and 
// throws an exception if the string does not contain vowels. 
 
import java.util.Scanner;
class NoVowelsException extends Exception{
    public NoVowelsException(String message){
        super(message);

    }
}

public class test12 {

    public void Chack(String s) throws NoVowelsException{
        for (int i = 0 ; i < s.length() ; i++) {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){

            }
            else{
                throw new NoVowelsException("There is no vowles...");
            }
        }
    }

    public static void main(String[] args) {
        
    }
}