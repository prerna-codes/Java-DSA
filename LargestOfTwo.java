package FirstJavaProgram;
import java.util.Scanner;
public class LargestOfTwo {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two Num : ");
		int a=in.nextInt();
		int b=in.nextInt();
		if(a>b)
			System.out.println(a + " is largest number");
		else
			System.out.println(b + " is largest number");
	}
}
