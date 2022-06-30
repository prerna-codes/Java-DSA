package ConditionalLoops;
//public static double pow(double a, double b)
//Parameter:
//a : this parameter is the base
//b : this parameter is the exponent.
//Return :
//This method returns ab.
import java.util.Scanner;
public class Power {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double a;double b;
		System.out.println("Power of given a and b : a^b");
		 a = sc.nextInt();
		 b= sc.nextInt();
		System.out.println(Math.pow(a,b));
	}
}
