package ConditionalLoops;
//Calculate Average Of N Numbers
import java.util.Scanner;
public class AverageOfNNumbers {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Total count of number to find the average of: ");
		int n = sc.nextInt();
		int sum = 0;
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++){
			sum += sc.nextInt();
		}
		double average = sum/(double)n; // typecasting n from int to double for decimal division
		System.out.println("Average of n given numbers is "+average);
	}
}
