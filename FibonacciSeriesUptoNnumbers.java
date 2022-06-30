package FirstJavaProgram;
//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class FibonacciSeriesUptoNnumbers {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter total no : ");
		int n=in.nextInt();
		int i,n1=0,n2=1,n3;
		//System.out.print("fibonacci Series : ");
		System.out.print("Fibonacci Series :" + n1 +" " + n2);
		for(i=2;i<=n;++i){
			n3=n1+n2;
			System.out.print( " "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
