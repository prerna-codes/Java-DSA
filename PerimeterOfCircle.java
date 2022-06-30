package ConditionalLoops;
import java.util.Scanner;
public class PerimeterOfCircle {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius : ");
		int r= in.nextInt();
		double p = 2*3.14*r;
		System.out.println("Perimeter of circle : " + p);
	}
}
