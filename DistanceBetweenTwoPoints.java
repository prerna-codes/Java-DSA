package ConditionalLoops;
//Calculate Distance Between Two Points
import java.util.Scanner;
public class DistanceBetweenTwoPoints {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Value of x1 and y1:");
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		System.out.print("Value of x2 and y2 :");
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Distance between two points ="+ d);
	}
}
