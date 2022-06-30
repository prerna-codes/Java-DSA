package ConditionalLoops;
import java.util.Scanner;
public class PerimeterOfParallelogram {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter side : ");
		int s= in.nextInt();
		System.out.println("Enter base : ");
		int b= in.nextInt();
		double P = 2*(s+b);
		System.out.println("Perimeter of parallelogram : " + P);
	}
}
