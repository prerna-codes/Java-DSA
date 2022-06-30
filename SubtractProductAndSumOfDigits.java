package ConditionalLoops;
import java.util.Scanner;
public class SubtractProductAndSumOfDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
		//1. sum of digits
		//2. product of digits
		//3. subtract product and sum of digits= product-sum
		int sum = 0;
		int product = 1;
		while (n > 0) {
			sum += n % 10;
			product *= n % 10;
			n /= 10;
			int ans = product - sum;
			System.out.println(ans);
		}
	}
}
//Another method
//int sum = 0;  //sum
//	int copy = n;
//    while (copy > 0) {
//		    sum += copy % 10;
//		    copy /= 10;
//		    }
//		    int prod = 1; //product
//		    copy = n;
//		    while (copy > 0) {
//		    prod *= copy % 10;
//		    copy /= 10;
//		    }
//         ans=prod-sum;
//       print(ans);