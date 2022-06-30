package GfgMiscellaneous;
import java.util.Scanner;
public class AvgOftwoNums {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a= in.nextInt();
		int b= in.nextInt();
		//fomula: (a+b)/ Total num i.e.2
		int avg= (a+b)/2;
		System.out.println("Average = " + avg);
	}
}
