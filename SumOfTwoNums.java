package FlowOfProgram;
//Take two numbers and print the sum of both.
import java.util.Scanner;
public class SumOfTwoNums {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a= in.nextInt();
		int b= in.nextInt();
		System.out.println("Sum = "+ (a+b));
	}
}
