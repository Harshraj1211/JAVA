//Write a program to create circle class with area function to find area of circle.
import java.lang.Math;
import java.util.Scanner;
class Circle{

	double radius;
	double area;

	// public Circle(int radius){
	// 	this.radius=radius;
	// }

		public Circle(int radius2) {
			this.radius=radius;
		}
		public void area(){
			area=Math.PI*radius*radius;
		}
		public void printarea(){
			System.out.print("Area of Circle with radius "+radius+" = "+area);
		}
	}
	
	public class lab6_a1{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter radius of Circle: ");
			int radius= input.nextInt();
			Circle c1 = new Circle(radius); 
		c1.area();
		c1.printarea();
	}
}