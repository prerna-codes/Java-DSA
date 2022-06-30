package ConditionalLoops;
import java.util.Scanner;
public class VolOfCylinder {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius : ");
		int r= in.nextInt();
		System.out.println("Enter height : ");
		int h= in.nextInt();
		double v = (3.14*r*r*h);
		System.out.println("Volume Of Cone : " + v);
	}
}
