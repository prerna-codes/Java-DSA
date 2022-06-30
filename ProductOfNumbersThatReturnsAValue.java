package Function;

import java.util.Scanner;

public class ProductOfNumbersThatReturnsAValue {
	static int pro(int x,int y) {
		return x*y;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two no :");
		int x= in.nextInt();
		int y= in.nextInt();
		System.out.println("Product = " +pro(x,y));
	}
}
