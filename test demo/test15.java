import java.util.*;
import java.io.File;
import java.io.IOException;

public class test15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File f1=new File("test14.java");
        
        try {
            f1.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("File name : " + f1.getName());


    }    
}
