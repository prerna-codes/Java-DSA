package ConditionalLoops;
//Area of Circle
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.print("Radius = ");
		int r= in.nextInt();
		double a= 3.14*r*r;
		System.out.print("Area of circle = " + a);
	}
}
