import java.util.Scanner;

class cube{
    int width;
    int hight;
    int depth;

    cube(int w,int h,int d){
        System.out.println("non-argument constructor : ");
        width=w;
        hight=h;
        depth=d;
    }
}

public class test7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cube c=new cube(10,10,10);
        System.out.println(c.width);
        System.out.println(c.hight);
        System.out.println(c.depth);
    }
}