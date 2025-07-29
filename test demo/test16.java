import java.util.*;
public class test16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> StudentName=new ArrayList<>();
        System.out.println("Enter Name : ");

        while (true) {
            String name=sc.nextLine();
            if (name.equalsIgnoreCase("EXIT")) {
                break;
            }        
            StudentName.add(name);

        }

        System.out.println(StudentName);

    }
}
