package thred.syncronization;
import java.util.*;

class Table{
    synchronized void Printtable(int n){
        for (int i = 1 ; i <= 5 ; i++) {
            System.out.print(n*i + " ");
        }
    }
}

class Mythread1 extends Thread{
    Table t;
    Mythread1(Table t){
        this.t=t;
    }
    @Override
    public void run() {
        t.Printtable(5);
    }
}

// class Mythread2 extends Thread{
//     Table t;
//     Mythread2(Table t){
//         this.t=t;
//     }
//     @Override
//     public void run() {
//         t.Printtable(10);
//     }
// }

public class syncro {
    public static void main(String[] args) {
        Table obj=new Table();

        Mythread1 t1=new Mythread1(obj);
        t1.start();
        // Mythread2 t2=new Mythread2(obj);
        // t2.start();
    }
}
