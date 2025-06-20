// Write an application that executes two threads. One thread displays "Good Morning" 
// every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 
// milliseconds. Create the threads by implementing the Runnable interface. [A]

package lab11;
import java.util.*;
class GM implements Runnable{
    
    @Override
    public void run() {
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Good morning");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class GA implements Runnable{
    
    @Override
    public void run() {
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Good Afternoon");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class lab11_a2 {   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GM gm1=new GM();
        GA ga1=new GA();

        Thread t1=new Thread(gm1);
        Thread t2=new Thread(ga1);

        t1.start();
        t2.start();
    }
}