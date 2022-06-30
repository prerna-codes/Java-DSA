package FirstJavaProgram;
//Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Principle = ");
		int p= in.nextInt();
		System.out.print("Time = ");
		int t= in.nextInt();
		System.out.print("Rate = ");
		int r= in.nextInt();
		int si=(p*r*t)/100;
		System.out.println("Simple Interest = " + si);

	}
}
