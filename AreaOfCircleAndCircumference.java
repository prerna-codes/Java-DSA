package Function;

import java.util.Scanner;

public class AreaOfCircleAndCircumference {
	static void cir() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius :");
		int r= in.nextInt();
		System.out.println("Area of circle = " +(3.14*r*r));
		System.out.println("Circumference of circle = " +(2*3.14*r));
	}
	public static void main(String[]args){
		cir();
	}
}
