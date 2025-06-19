// Write a program to create Account class, which is representing a bank account where 
// we can deposit and withdraw money. If user need to withdraw money which exceed 
// our minimum bank balance then it will not be allowed, and will throw  
// InSufficientFundException(Custom Exception). Handle above exception and display 
// proper error message.


import java.util.*;

class InsufficientFundException extends Exception {
    public InsufficientFundException(String msg) {
        super(msg);
    }
}

class Account {
    private String accountNumber;
    private String accountHolerName;
    private double balance;
    private static final double Min_balance = 1000;

    Account(String accountNumber, String accountHolerName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolerName = accountHolerName;
        this.balance = balance;
    }

    protected void deposit(double depo) {
        if (depo > 0) {
            balance = balance + depo;
            System.out.println("diposit successfull.");
        } else {
            System.out.println("invelid amount.");
        }
    }

    protected void withdrow(double withdrow) {
        try {
            if (withdrow <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive.");
            }

            if ((balance - withdrow) < Min_balance) {
                throw new InsufficientFundException("Withdrawal failed! Minimum balance of ₹1000 must be maintained.");
            }

            balance -= withdrow;
            System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);

        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }

    protected void printDetails() {
        System.out.println("accountNumber : " + this.accountNumber);
        System.out.println("account holder name : " + this.accountHolerName);
        System.out.println("Balance : " + this.balance);
    }

}

public class lab10_a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account ba1 = new Account("101010", "H", 0);
        ba1.deposit(10000);
        ba1.withdrow(9100);
        ba1.printDetails();
    }
}
