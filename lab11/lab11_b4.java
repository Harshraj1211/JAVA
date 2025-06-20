// Write a program to create two threads, one thread will print odd numbers and second 
// thread will print even numbers between 1 to 20 numbers. [B] 

package lab11;
import java.util.*;
class odd extends Thread {
    @Override
    public void run() {
        for (int i = 1 ; i <= 20 ; i++) {
            if(i%2!=0){
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class even extends Thread {
    @Override
    public void run() {
        for (int i = 1 ; i <= 20 ; i++) {
            if(i%2==0){
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class lab11_b4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        odd o1=new odd();
        Thread t1=new Thread(o1);
        even e1=new even();
        Thread t2=new Thread(e1);

        t1.start();
        t2.start();
    }
}