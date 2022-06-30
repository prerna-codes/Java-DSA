package ConditionalLoops;
import java.util.Scanner;
//Calculate Discount Of Product
public class DiscountOfProduct {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Original cost :");
		int c= sc.nextInt();
		System.out.println("Discount rate :");
		int d= sc.nextInt();
		 int s=100-d;
		 double amt = (s*c)/100;
		System.out.println("amount after discount="+amt);
	}
}
