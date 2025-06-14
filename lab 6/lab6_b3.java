//Create a class which ask the user to enter a sentence, and it should display count of 
// each vowel type in the sentence. The program should continue till user enters a word 
// “quit”. Display the total count of each vowel for all sentences. [B]
import java.util.*;
class vowel {
    String sentence;
    int count;
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence = ");
        String sentence = sc.nextLine();
        this.sentence = sentence;
    }
    public void countVowel() {
        int count=0;
        int i=0;
        for(i=0 ; i<sentence.length() ; i++){
            char ch=sentence.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                count++;
            }          
        }
        this.count=count;
    }
    public void displayDetails() {
        System.out.println();
        System.out.println("Vowel = " + this.count);
    }
}
public class lab6_b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vowel v1 = new vowel();
        v1.getDetails();
        v1.displayDetails();
    }
}