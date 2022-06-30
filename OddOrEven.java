package Function;
import java.util.Scanner;
//Define a program to find out whether a given number is even or odd.
public class OddOrEven {
	static void myMethod(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a num : ");
		int a= in.nextInt();
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}
	public static void main(String[]args){
		myMethod();
	}
}
