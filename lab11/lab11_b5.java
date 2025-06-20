// Write a java program that implements a multi-thread application that has 
// three threads. First thread generates random integer every 1 second and if 
// the value is even, second thread computes the square of the number and 
// prints. If the value is odd, the third thread will print the value of cube of 
// the number. [B] 

package lab11;
import java.util.*;

class rendom extends Thread{
    // (math.rendom*n)+1
    @Override
    public void run() {
        for (int i = 1 ; i < 10 ; i++) {
            try {
                int ans= (int)(Math.random()*30)+1;
                Thread.sleep(1000);
                if(ans%2==0){
                    rendom r2=new rendom();
                    r2.square(ans);
                }
                else{
                    rendom r3=new rendom();
                    r3.cube(ans);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void square(int ans) {
        
        ans=ans*ans;

        System.out.println(ans);
    }
    private void cube(int ans) {
        
        ans=ans*ans*ans;

        System.out.println(ans);
    }
}

public class lab11_b5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        rendom r1=new rendom();
        Thread t1=new Thread(r1);

        r1.start();
    }
}
