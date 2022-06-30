package Function;

import java.util.Scanner;

public class VoteOrNot {
	static void voting(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the age : ");
		int n=in.nextInt();
		if(n>=18)
			System.out.println("Can Vote");
		else
			System.out.println("Cannot vote");
	}
	public static void main(String[]args){
		voting();
	}
}
