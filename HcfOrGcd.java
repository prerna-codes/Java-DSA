package GfgMiscellaneous;
import java.util.Scanner;
public class HcfOrGcd {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter no : ");
		int n1= in.nextInt();
		int n2= in.nextInt();
		while(n1!=n2){
			if(n1>n2)
				n1=n1-n2;
			else
				n2=n2-n1;
		}
		System.out.println("GCD = " + n2);
	}
}
