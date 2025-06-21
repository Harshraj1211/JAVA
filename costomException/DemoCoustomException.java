package costomException;
import java.util.*;

class MyException extends Exception{
    public MyException(String massage){
        super(massage);
    }
}

public class DemoCoustomException {    
    int accountbalance;

    DemoCoustomException(int accountbalance){
        this.accountbalance=accountbalance;
    }

    public void withdrow(int balance) throws MyException{
        try {
            if(accountbalance<1000){
                throw new MyException("Balance must have to 1000");
            }
            else{
                accountbalance-=balance;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayBalance(){
        System.out.println(accountbalance);
    }

    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        DemoCoustomException dce=new DemoCoustomException(10000);

        dce.withdrow(8000);
        dce.displayBalance();
    }
}
