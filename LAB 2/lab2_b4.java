// 5. Write a program to convert temperature from Fahrenheit to Celsius. 
// (Formula : c = f-32*5/9 ); 
import java.util.*;
public class lab2_b4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FAHRENHEIT F : ");
		int f=sc.nextInt();
		int c;	
		c=f-32*5/9;
		System.out.println("TEMPRATURE IN CELSIUS IS : ");
		System.out.print(c);
		System.out.print(" DEGREE.");
	}
}