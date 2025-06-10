// Write a program to accept a line and check how many consonants and 
// vowels are there in line. 
import java.util.*;
public class lab4_a2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line : ");
        String line=sc.nextLine();
        int vowels=0;
        int consonants=0;
        int i=0;
        for(i=0 ; i<line.length() ; i++){
            char ch=line.charAt(i);
            if(ch=='a' && ch=='A' && ch=='e' && ch=='E' && ch=='i' && ch=='I' && ch=='o' && ch=='O' && ch=='u' && ch=='U'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Counts of vowels : " + vowels);
        System.out.println("Count of consonants : " + consonants);
    }
}