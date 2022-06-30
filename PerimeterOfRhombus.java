package ConditionalLoops;
import java.util.Scanner;
public class PerimeterOfRhombus {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter side : ");
		int a= in.nextInt();
		double P = 4*a;
		System.out.println("Perimeter of Rhombus : " + P);

	}
}
