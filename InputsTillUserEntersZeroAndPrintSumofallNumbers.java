package ConditionalLoops;
//Take integer inputs till the user enters 0 and print the sum of all numbers
//(HINT: while loop)
import java.util.Scanner;
public class InputsTillUserEntersZeroAndPrintSumofallNumbers {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("enter no : ");
		int sum=0;
		int n=in.nextInt();
		if(n!=0) {
			sum = sum + n;
			System.out.println(sum);
		}
		else {
			System.out.println("Thanks");
		}
	}
}
