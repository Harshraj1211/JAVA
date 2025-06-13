// Create a class named Bank_Account with data memebers accountNo, userName, email, 
// accountType and accountBalance, Also create methods getAccountDetails() and 
// displayAccountDetails(). [A] 
import java.util.*;
class Bank_Account{
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;
    
    public void getAccountDetails(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        int accountNo = sc.nextInt();
        this.accountNo=accountNo;
        
        System.out.println("Enter user name : ");
        String userName=sc.nextLine();
        this.userName=userName; 
        
        System.out.println("Enter email id : ");
        String email=sc.nextLine();
        this.email=email;
        
        System.out.println("Enter account account type : ");
        String accountType = sc.nextLine();
        this.accountType=accountType;
        
        System.out.println("Enter Balance : ");
        int accountBalance=sc.nextInt();
        this.accountBalance=accountBalance;
    }
    public void displayAccountDetails(){
        System.out.println("Account number = " + accountNo);
        System.out.println("User Name = " + userName);
        System.out.println("Email = " + email);
        System.out.println("Account Type = " + accountType);
        System.out.println("Account Balance = " + accountBalance);
    }
}
public class lab6_a4 {
    public static void main(String[] args){
        Bank_Account b1=new Bank_Account();
        b1.getAccountDetails();
        b1.displayAccountDetails();
    }   
}