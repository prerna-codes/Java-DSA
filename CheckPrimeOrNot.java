package Function;

import java.util.Scanner;

public class CheckPrimeOrNot {
	static void prime() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no :");
		int n= in.nextInt();
		int t=0;
		for (int i=2;i<=n-1;i++){
			if(n%i==0)
				t=t+1;
		}
		if(t==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime");
	}
	public static void main(String[]args){
		prime();
	}
}
