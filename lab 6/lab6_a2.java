// Define Time class with constructor to initialize hour and minute. Also define addition 
// method to add two time objects.
import java.util.*;
import java.lang.Math;
class Time{
	int hour;
	int minute;

	public void time(int hour,int minute){
		this.hour=hour;
		this.minute=minute;
	}
	public void add(Time t2){
		this.minute+=minute;
		if(this.minute>59){
			this.hour++;
			this.minute=this.minute-60;
		}
		this.hour+=hour;
	}
	public void print(){
		System.out.println("Time = (" + hour + " : " + minute + ")");
	}
	public class lab6_a2{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter First hour : ");
			int hour1=sc.nextInt();
			System.out.println("Enter First minute : ");
			int minute1=sc.nextInt();

			System.out.println("Enter Second hour : ");
			int hour2=sc.nextInt();
			System.out.println("Enter Second minute : ");
			int minute2=sc.nextInt();
			Time t1=new Time();
			Time t2=new Time();

			t1.add(t2);
			t1.print();

		}
	}
}