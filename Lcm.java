package GfgMiscellaneous;
import java.util.Scanner;
public class Lcm {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number :: ");
		int a = in.nextInt();
		System.out.println("Enter second number :: ");
		int b = in.nextInt();
		int hcf=0;
		for(int i=1;i<=a ||i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			hcf=i;
		}
		System.out.println("HCF of two numbers = " +hcf);
		//LCM formula = (a*b)/GCD(a,b)
		int Lcm=(a*b)/hcf;
		System.out.println("LCM of two numbers = "+ Lcm);
	}
}
