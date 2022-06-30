package Function;

import java.util.Scanner;

public class CheckPalindriomeOrNot {
	static void check(int x){
		Scanner in= new Scanner(System.in);
		int r,sum=0,temp;
		System.out.println("Enter a palindrome number: ");
		int n= in.nextInt();
		temp=n;
		while(n>0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp==sum)
			System.out.println("is Palindrome");
		else
			System.out.println("is not palindrome");

	}
	public static void main(String[]args){
		check(153);
	}
}
