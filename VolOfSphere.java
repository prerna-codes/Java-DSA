package ConditionalLoops;
import java.util.Scanner;
public class VolOfSphere {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius : ");
		int r= in.nextInt();
		double v = (4*3.14*r*r*r)/3;
		System.out.println("Volume Of Sphere : " + v);
	}
}
