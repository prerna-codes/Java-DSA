package GfgMiscellaneous;
import java.util.Scanner;
public class ReverseAString {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s= in.nextLine();
		// convert String to character array by using toCharArray
		char[] resultarray = s.toCharArray();
		//iteration
		for (int i = resultarray.length - 1; i >= 0; i--)
			// print reversed String
			System.out.print(resultarray[i]);
	}
}
