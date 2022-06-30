package ConditionalLoops;
//Input a number and print all the factors of that number (use loops).
import java.util.Scanner;
public class FactorsOfaNumber {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter num : ");
		int n=in.nextInt();
		System.out.println("Factors of " + n +" :");
		for (int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i + " ");
			}
		}

	}
}
