package ConditionalLoops;
import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter side : ");
		int s= in.nextInt();
		double P = 3*s;
		System.out.println("Perimeter of Traingle : " + P);
	}
}
