// Implement a class named Bank_Account and constructor to intailize balance, 
// with data memebers accountNo and accountBalance, also create methods 
// displayBalance(), deposit() and withdraw().Maintain minimum balance of 1000/
// Rs. and throw an Exception if balance becomes less than  1000/-Rs.

import java.util.Scanner;

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}

class Bank_Account{
    long accountNo;
    int accountBalance;
    int balance;

    Bank_Account(long accountNo,int accountBalance,int balance){
        this.accountNo=accountNo;
        this.accountBalance=accountBalance;
        this.balance=balance;
    }


    public void deposit(int balance) throws MyException{
        if(balance>0){
            accountBalance+=balance;
        }
        else{
            throw new MyException("Invelid balance.");
        }
    }
    
    public void withdraw(int balance){
        try {
            if(accountBalance<1000){
                throw new MyException("Minimum belence must have to 1000.");
            }
            else{
                accountBalance-=balance;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void displayBalance(){
        System.out.println("Curront account balance : " + accountBalance);
    }
}

public class test14 {
    public static void main(String[] args) throws MyException {
        Scanner sc=new Scanner(System.in);
        
        Bank_Account ba1=new Bank_Account(1001, 10000, 0);
        
        ba1.deposit(100);
        System.out.println("After deposit : balance : ");
        ba1.displayBalance();
        ba1.withdraw(1500);
        System.out.println("After withdrow balance : ");
        ba1.displayBalance();


    }
}
