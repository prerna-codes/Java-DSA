package FirstJavaProgram;
//To find Armstrong Number between two given number.
import java.util.Scanner;
public class ArmstrongNumberBetweenTwoNumbers {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.print("Enter first Num : ");
		int a=in.nextInt();
		System.out.print("Enter second Num : ");
		int b= in.nextInt();
		for(int i=a;i<b;i++){
			int t=i,rem,sum=0;
			while(t!=0){
				rem=t%10;
				sum= sum+(rem*rem*rem);
				t=t/10;
			}
			if(sum==i){
				System.out.println(""+i+" is an Armstrong number.");
			}
		}
	}
}
