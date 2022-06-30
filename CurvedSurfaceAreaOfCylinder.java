package ConditionalLoops;
import java.util.Scanner;
public class CurvedSurfaceAreaOfCylinder {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius : ");
		int r= in.nextInt();
		System.out.println("Enter height : ");
		int h= in.nextInt();
		double c = (2*3.14*r*h);
		System.out.println("Curved Surface area of cylinder : " + c);
	}
}
