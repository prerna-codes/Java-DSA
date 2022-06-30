package Function;

import java.util.Scanner;

public class SumOfTwoNumbers {
	static void sum(){
		Scanner in=new Scanner(System.in);
		System.out.println("Sum of two Numbers ");
		System.out.println("Enter two no :");
			 int a= in.nextInt();
		    int  b= in.nextInt();
			int c=a+b;
		System.out.println("Sum = " + c);
		}
		public static void main(String[]args){
		sum();
	}
}
