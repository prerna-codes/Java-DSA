package ConditionalLoops;
import java.util.Scanner;
public class AreaOfIsoscelesTriangle {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter base : ");
		int b=in.nextInt();
		System.out.println("Enter the height : ");
		int h=in.nextInt();
		double a= (b*h)/2;
		System.out.println("Area of Isosceles Triangle : ");
	}
}
