// Write a java program to create Custom Exception ( DarshanUniException). Catch this 
// exception using throw clause and print appropriate message. [A]

import java.util.*;

public class lab10_a3 {

    class DarshanUniException extends Exception{
        public DarshanUniException(String msg){
            super(msg);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First String : ");
        String str=sc.nextLine();

        System.out.println("Enter Second String : ");
        String str1=sc.next();

        try{
            if (str1.equals(str)) {
                // throw new DarshanUniException("Custom Exception: Strings are the same!");
            } else {
                System.out.println("Strings are different. No exception occurred.");
            }
        }
        catch(Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }

    }    
}
