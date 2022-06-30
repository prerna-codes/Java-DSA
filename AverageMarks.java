package ConditionalLoops;
import java.util.Scanner;
public class AverageMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of Subjects : ");
		int n = sc.nextInt();
		double sum=0 , avg=0;
		System.out.println("Enter Marks : ");
		for(int i=1;i<=n;i++) {
			int m = sc.nextInt();
			sum=sum+m;
		}
		System.out.println("Total marks : "+ sum);
		avg =sum/n;
		System.out.println("Average marks : " + avg);
	}
}
