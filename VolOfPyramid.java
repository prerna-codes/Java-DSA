package ConditionalLoops;
import java.util.Scanner;
public class VolOfPyramid {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter length : ");
		int l= in.nextInt();
		System.out.println("Enter width : ");
		int w= in.nextInt();
		System.out.println("Enter height : ");
		int h= in.nextInt();
		double v = (l*w*h)/3;
		System.out.println("Volum e Of Pyramid : " + v);
	}
}
