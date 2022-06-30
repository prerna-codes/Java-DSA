package FlowOfProgram;

import java.util.Scanner;
import java.util.Scanner;
public class SumOfNnumbers {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("\n Enter Number of Numbers to be Calculated: ");
		int n=in.nextInt();
		int sum=0;
		for(int i=0;i<n;i++){
			System.out.println("Enter the number : ");
			int m=in.nextInt();
			sum=sum+m;
		}
		System.out.println("The sum of the numbers is: "+sum);
	}
}
