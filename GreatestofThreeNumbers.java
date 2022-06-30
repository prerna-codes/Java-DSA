package GfgMiscellaneous;
import java.util.Scanner;
public class GreatestofThreeNumbers {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int a= in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if((a>b)&(a>c)){
			System.out.println(a + " is greatest no.");
		}
		else if((b>c)&(b>a)){
			System.out.println(b + " is greatest no.");
		}
		else{
			System.out.println(c + " is greatest no.");
		}

	}
}
