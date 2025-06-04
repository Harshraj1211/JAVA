// import java.util.*;
// public class lab2_a2
// {
// 	public static void main(String[] args)
// 	{
// 		Scanner sc=new Scanner(System.in);

// 		int a = 10 + 20 * 30;
// 		int b = 100 / 10 * 100; 
// 		int c = 5 * 4 / 4 % 3;

// 		System.out.println(a);
// 		System.out.println(b);
// 		System.out.println(c);

// 	}
// }
import java.util.*;
public class lab2_a2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER FIRST NUMBER : ");
		int a=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER : ");
		int b=sc.nextInt();

		
		String str=sc.next();

		if(str.equals("+")){
			System.out.println(a+b);
		}
		else if(str.equals("-")){
			System.out.println(a-b);
		}
		else if(str.equals("*")){
			System.out.println(a*b);
		}
		else if(str.equals("/")){
			System.out.println(a/b);
		}
	}
}
// import java.util.*;
// public class lab2_b3{
// 	public static void main(String[] abc){
// 		Scanner sc=new Scanner(System.in);
// 		String a="abc";

// 		if(s=="abc"){
// 			System.out.println("PRINT ABC");
// 		}
// 		else{
// 			System.out.println("WRONG.");
// 		}
// 	}
// }