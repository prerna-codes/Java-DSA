package FirstJavaProgram;
//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)
import java.util.Scanner;
public class Calculator {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first num : ");
		int a= in.nextInt();
		System.out.println("Enter the second num : ");
		int b= in.nextInt();
		System.out.println("Enter opertor : ");
		char op=in.next().charAt(0); int ans;
		if(op=='+'){
			ans=a+b;
			System.out.println(a+b);
		}
		if(op=='-'){
			ans=a+b;
			System.out.println(a-b);
		}
		if(op=='*'){
			ans=a+b;
			System.out.println(a*b);
		}
		if(op=='%'){
			ans=a+b;
			System.out.println(a%b);
		}
		if(op=='/'){
			ans=a+b;
			System.out.println(a/b);
		}
	}
}
