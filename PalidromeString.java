package GfgMiscellaneous;
import java.util.Scanner;
public class PalidromeString {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome : ");
		String s, reverse = "";
		s = in.nextLine();
		int length = s.length();
		for ( int i = length - 1; i >= 0; i-- )
			reverse = reverse + s.charAt(i);
		if (s.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");
	}
}
