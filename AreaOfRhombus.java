package ConditionalLoops;
import java.util.Scanner;
public class AreaOfRhombus {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first diagonal = ");
		int p= in.nextInt();
		System.out.println("Enter second diagonal = ");
		int q=in.nextInt();
		double a=(p*q)/2;
		System.out.println("Area of Rhombus : "+ a);
	}
}
