package thred;

import array.runsperover;

public class test{
    public static void main(String[] args) {
        
        World world=new World(); // new
        world.start();// runnable
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");

        }
    }


    // @Override
    // public void run() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'run'");
    // }
}
