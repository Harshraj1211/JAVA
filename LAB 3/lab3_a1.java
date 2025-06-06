// The marks obtained by a student in 5 different subjects are input 
// through the keyboard.  
// The student gets a division as per the following rules: 
// I. Percentage above or equals to 60-first division 
// II. Percentage between 50 to 59-second division 
// III. Percentage between 40 and 49-Third division 
// IV. Percentage less than 40-fail 
// Write a program to calculate the division obtained by the student.
import java.util.*;
public class lab3_a1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[5];
		int i=1;
		int sum=0;
		System.out.println("ENTER MARKS OF THE STUDENT.");
		
		for(i=1 ; i<=5 ; i++){
			System.out.println(marks[i]);
			sum+=marks[i];
		}
		int p;
		p=sum/100;

		System.out.println(p);

		if(p<=60){
			System.out.println("FIRST DIVISION.");
		}
		else if(p>=50 && p<=59){
			System.out.println("SECOND DIVISION.");
		}
		else if(p>=40 && p<=49){
			System.out.println("THIRD DIVISION.");
		}
		else if(p<40){
			System.out.println("FAIL.");
		}


	}
}