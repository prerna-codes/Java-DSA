package ConditionalLoops;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter base : ");
		int b= in.nextInt();
		System.out.println("Enter height : ");
		int h= in.nextInt();
		double a=(b*h)/2;
		System.out.println("Area Of Triangle : " + a);
	}
}
