package Function;
import java.util.Scanner;
public class FactorialOfANumber {
	static void factorial(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no : ");
		int n= in.nextInt();
		int fac=1;
		for (int i=1;i<=n;i++){
			 fac = fac * i;
		}
		System.out.print("factorial = " + fac);
	}
	public static void main(String[]args){
		factorial();
	}
}
