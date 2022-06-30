package ConditionalLoops;
// Compound Interest = Amount – Principal
//Amount = P(1+r/n)^t , where A = amount
//P = principal
//r = rate of interest
//n = number of times interest is compounded per year
//t = time (in years)
import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Principle  :");
		int p = sc.nextInt();
		System.out.print("Rate  :");
		int r = sc.nextInt();
		System.out.print("Number of times interest is compounded per year :");
		int n = sc.nextInt();
		System.out.print("Time  :");
		int t = sc.nextInt();
		double amount = p * Math.pow((1 + r / n), t);
		System.out.println("Required Amount = " + amount);
		double ci = amount - p;
		System.out.println("Compound Interest : " + ci);
	}
}