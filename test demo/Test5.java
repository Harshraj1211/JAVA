
// find the last word of the string
import java.util.*;

public class Test5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");

        String s = sc.nextLine();

        int li = s.lastIndexOf(' ');

        String lastword=s.substring(li+1);

        System.out.println(lastword);
    }
}