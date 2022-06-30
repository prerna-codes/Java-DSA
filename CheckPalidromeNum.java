package GfgMiscellaneous;
import java.util.Scanner;
public class CheckPalidromeNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Palindrome Number: ");
		int n = in.nextInt();
		int t = n, rem, rev = 0;
		while (t!=0) {
			rem = t % 10;
			rev = (rev * 10) + rem;
			t = t / 10;
		}
		if(n==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
	}
}

