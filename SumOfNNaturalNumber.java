package FirstJavaProgram;
import java.util.Scanner;
public class SumOfNNaturalNumber {
	static void sum(){
		int num, j, sum1 = 0;
//object of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Sum from: ");
//takes an integer as input
		j = sc.nextInt();
		System.out.print("Sum up to: ");
//takes an integer as input
		num = sc.nextInt();
		for (int i=1;i<=num;i++){
			sum1=sum1+i;
		}
		System.out.println("Sum of Natural Numbers = " + sum1);
	}
	public static void main(String[]args){
		sum();
	}
}
