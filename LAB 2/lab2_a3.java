// A 3 Write a program to calculate the area of Rectangle.[A] 
import java.util.*;
public class lab2_a3{
	public static void main(String[] abcd){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER LENGTH OF RECTANGLE : ");
		int a=sc.nextInt();
		System.out.println("ENTER WIDTH OF RECTANGLE : ");
		int b=sc.nextInt();

		int c=a*b;

		System.out.println("AREA OF RECTANGLE IS : ");
		System.out.println(c);

	}
}