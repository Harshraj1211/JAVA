import java.util.Scanner;

class Add{
    
    static int count;

    Add(){
        count++;
    }
}

public class test18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Add a1=new Add();
        Add a2=new Add();
        Add a3=new Add();
        Add a4=new Add();
        Add a5=new Add();

        System.out.println(a1.count);

    }
}
