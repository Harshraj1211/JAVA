import java.util.Scanner;
import java.io.*;
public class test10 {

    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("");
        BufferedReader br=new BufferedReader(fr);
        char c[]=new char[20];
        br.skip(8);
        if(br.ready()){
            System.out.println(br.readLine());
            br.read(c);
            for (int i = 0 ; i < 20 ; i++) {
                System.out.println(c[i]);
            }
        }
    }
}