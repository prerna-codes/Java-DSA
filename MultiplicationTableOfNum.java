package FlowOfProgram;
//Take a number as input and print the multiplication table for it.
import java.util.Scanner;
public class MultiplicationTableOfNum {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Multiplication Table of  " );
		int n=in.nextInt();
		for(int i=1;i<=10;i++){
			int mu=n*i;
			System.out.println(n +"*" +i  + "=" + mu);
		}
	}
}
