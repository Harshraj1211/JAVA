// incripting and decripting
import java.util.*;
public class  test4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the massage : ");
        String msg=sc.nextLine();

        System.out.println("Enter 1 for Encryption or 2 for Decryption");
        int a=sc.nextInt();

        System.out.println("Enter key : ");
        int key=sc.nextInt();

        int i=0;
        if(a==1){
            System.out.println("Your Encrypted Massage : ");
        }
        else if(a==2){
            System.out.println("Your Decrypted Massage : ");
        }
        else if(a!=1 && a!=2){
            System.out.println("Error.......");
            System.out.println("First Select that you wan't to Encrypt or Decrypt your Massage.");
        }
        for(i=0 ; i<msg.length() ; i++){
            char temp = (char) msg.charAt(i);
            if(a==1){
                temp+=key;
                System.out.print(temp);
            }
            else if(a==2){
                temp-=key;
                System.out.print(temp);
            }
        }
    }
}