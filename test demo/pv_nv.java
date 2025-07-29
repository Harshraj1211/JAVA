import java.util.*;
public class pv_nv{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER A : ");
		int a=sc.nextInt();

		if(a>0){
			System.out.println("GIVEN NUMBER IS POSITIVE.");
		}
		else if(a<0){
			System.out.println("GIVEN NUMBER IS NEGATIVE.");
		}
		else if(a==0){
			System.out.println("GIVEN NUMBER IS ZERO.");
		}
	}
}