package GfgMiscellaneous;
import java.util.Scanner;
public class CheckOddorEven {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n= in.nextInt();
		if(n%2==0){
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
