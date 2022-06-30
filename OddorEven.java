package FirstJavaProgram;
//Write a program to print whether a number is even or odd, also take
//input from the user.
import java.util.Scanner;
public class OddorEven {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Number = ");
		int n=in.nextInt();
		if(n%2==0){
			System.out.println("Even No");
		}
		else{
			System.out.println("Odd No");
		}
	}
}
