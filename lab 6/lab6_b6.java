// WAP that counts the number of objects created using static. [B] 
import java.util.*;
class obj{
    static int counts = 0;

    public obj(){
        counts++;
    }

    public void getobj(){
        System.out.println("Count of obj : " + counts);
    }

}
public class lab6_b6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        obj o1=new obj();
        obj o2=new obj();
        obj o3=new obj();
        obj o4=new obj();
        obj o5=new obj();
        obj o6=new obj();
        obj o7=new obj();

        o1.getobj();

    }
    
}