package GfgMiscellaneous;
import java.util.Scanner;
public class CheckLeapYear {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a year: ");
		int n= in.nextInt();
		//formula= year/4

		if(n%4==0) {
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}
}
