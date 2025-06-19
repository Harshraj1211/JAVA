// Write a program in java if number is less than 10 and greater than 50, it generate the 
// exception out of range. Else it displays the square of number. [C]

import java.util.*;
import java.util.concurrent.Exchanger;

class outOfRenge extends Exception{
    public outOfRenge(String msg){
        super(msg);
    }
}

class lab10_c1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();

        try{
            if(num<10 || num> 50){
                throw new outOfRenge("numbwer is out of range.......");
            }
            else{
                System.out.println("Square of the " + num + " is " + (num*num));
            }
        }
        catch(outOfRenge oor){
            System.out.println("Exception : " + oor.getMessage());
        }

    }    
}