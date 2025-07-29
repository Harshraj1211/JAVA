// Implement Thread T1 and T2 using Runnable Interface in Java.
import java.lang.reflect.Executable;
import java.util.*;

class MyThread implements Runnable{

    protected String s;

    MyThread(String s){
        
        this.s=s;
    
    }

    @Override
    public void run() {

        for (int i = 1 ; i <= 5 ; i++) {
            System.out.println(s + " Running " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(s + " interrupted.");
            }

        }

    }
    
}
public class test13 {
    public static void main(String[] args) {
        MyThread T1=new MyThread("Thread 1");
        MyThread T2=new MyThread("Thread 2");

        Thread t1=new Thread(T1);
        Thread t2=new Thread(T2);

        t1.start();
        t2.start();
    }
}
