import java.lang.reflect.Array;
import java.util.*;
public class test17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Harsh");
        a1.add("Gohil");

        Iterator<String> itr=a1.iterator();

        while (itr.hasNext()) {
            String name=itr.next();

            System.out.println(name);
        }



    }
}
