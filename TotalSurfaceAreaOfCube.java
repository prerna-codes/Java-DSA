package ConditionalLoops;
import java.util.Scanner;
public class TotalSurfaceAreaOfCube {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter side : ");
		int a= in.nextInt();
		double sa = (6*a*a);
		System.out.println("Total Surface area of cone : " + sa);
	}
}
