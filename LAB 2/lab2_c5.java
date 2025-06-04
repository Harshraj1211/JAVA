import java.util.*;
public class lab2_c5{
	public static void main(String[] abc){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER : ");
		int a=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER : ");
		int b=sc.nextInt();
		System.out.println("ENTER THIRD NUMBER : ");
		int c=sc.nextInt();

		if(a>b){
			if(a>c){
				System.out.println("A IS MAX.");
			}
			else{
				System.out.println("C IS MAX.");
			}
		}
		else{
			System.out.println("B IS MAX.");
		}
	}
}