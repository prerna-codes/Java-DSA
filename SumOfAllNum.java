package FlowOfProgram;
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;
public class SumOfAllNum {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		// sum of all numbers upto given input from 1.
		System.out.println("No of terms :");
		int n=in.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++){
			sum=sum+i;
		}
		System.out.println("Sum of all no = "+ sum);
	}
}
