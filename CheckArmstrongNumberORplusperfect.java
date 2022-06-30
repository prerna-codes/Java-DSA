package GfgMiscellaneous;
//1.	Check Armstrong Number or Plus perfect
import java.util.Scanner;
public class CheckArmstrongNumberORplusperfect {
	public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a num :");
		int n=in.nextInt();
		int t1=n;
		int len=0;
		while(t1!=0){
			t1=t1/10;
			len=len+1;
		}
		int t2=n,rem;
		int arm=0;
		while(t2!=0){
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=len;i++){
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==n){
			System.out.println(n + " is armstrong no");
		}
		else
		{
			System.out.println(n + " is not armstrong number");
		}
	}
}
