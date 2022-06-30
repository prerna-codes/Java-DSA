package ConditionalLoops;
import java.util.Scanner;
public class PerimeterOfRectangle {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter length : ");
		int l= in.nextInt();
		System.out.println("Enter width : ");
		int w= in.nextInt();
		double P = 2*(l+w);
		System.out.println("Perimeter of Rectangle : " + P);
	}
}
