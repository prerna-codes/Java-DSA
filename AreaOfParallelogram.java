package ConditionalLoops;
import java.util.Scanner;
public class AreaOfParallelogram {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the base : ");
		int b=in.nextInt();
		System.out.println("Enter height : ");
		int h=in.nextInt();
		int a= b*h;
		System.out.println("Area Of Parallelogram : ");
	}
}
