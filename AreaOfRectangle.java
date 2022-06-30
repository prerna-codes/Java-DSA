package ConditionalLoops;
import java.util.Scanner;
public class AreaOfRectangle {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length : ");
		int l=in.nextInt();
		System.out.println("Enter the breadth : ");
		int b=in.nextInt();
		int a=l*b;
		System.out.println("Area Of Rectangfle  = " + a);
	}
}
