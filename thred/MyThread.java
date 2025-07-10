package thred;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.err.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException inte) {
            
            System.out.println(inte);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());//NEW
        t1.start();
        System.out.println(t1.getState());// RUNNING
        Thread.sleep(100);
        System.out.println(t1.getState());//TIME_WAITING
        t1.join();
        System.out.println(t1.getState());//TERMINATED
    }
}
