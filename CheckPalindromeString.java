package FirstJavaProgram;
//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class CheckPalindromeString {
	public static void main(String[]args){
		String s ,rev="";
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a Palindrome String :");
		s= in.nextLine();
		int length= s.length();
		for(int i=length-1;i>=0;i--)
			rev= rev+s.charAt(i);
		if (s.equals(rev))
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
	}
}
