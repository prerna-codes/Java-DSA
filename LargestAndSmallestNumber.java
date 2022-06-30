package Function;
import java.util.Scanner;
//Largest and Smallest of Three Numbers entered by user.
public class LargestAndSmallestNumber {
	static void myMethod(){
		Scanner in=new Scanner(System.in);
		int a = 0,b,c;
		System.out.println("Enter three no : ");
			 a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if((a>b)&&(a>c))
			System.out.println(a + " is greater");
		else if((b>a)&&(b>c))
			System.out.println(b + " is greater");
		if((c>a)&&(c>b))
			System.out.println(c + " is greater");
	}
	public static void main(String[]args){
//		Scanner in=new Scanner(System.in);
//		System.out.println("");
//		int n=in.nextInt();
       myMethod();
	}
}
