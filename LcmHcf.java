package FlowOfProgram;
//Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;
public class LcmHcf {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int n=in.nextInt();
		int m= in.nextInt();
		//HCF
		int hcf=0;
		for(int i=1;i<=n || i<=m;i++){
			if(n%i==0 && m%i==0){
				hcf=i;
			}
		}
		System.out.println("HCF of " + n +" and "+ m +"=" + hcf);
		//Hcf
		int lcm=(n*m)/hcf;
		System.out.println("LCM of " + n +" and " + m +"=" + lcm);
	}
}
