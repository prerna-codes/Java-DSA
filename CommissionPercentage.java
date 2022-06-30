package ConditionalLoops;
//Calculate Commission Percentage
//Formula : commission or sale_price=(commissionPercentage/100)*commission_amount;
import java.util.Scanner;
public class CommissionPercentage {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//int commission_amount;int sale_price;
		System.out.print("commission_amount:");
		double amount= sc.nextInt();
		System.out.print("Sale price :");
		double commission= sc.nextInt();
		double Commission_percentage= (commission / amount) * 100;
		System.out.println("commission_percentage  ="+ Commission_percentage  );
	}
}

