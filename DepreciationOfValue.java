package ConditionalLoops;
//Calculate Depreciation of Value
//The value of any article or item subject to wear and tear, decreases with time.decrease
// is called its Depreciation.V1: initial value, R rate of depreciation,T is time in yrs, v2 is value at end of T yr.
//		Input: V1 = 200, R = 10, T = 2	; Output: 162
// Formula: v2=v1 [1-r/100]^t
import java.util.Scanner;
public class DepreciationOfValue {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		long v1,r,t;
		System.out.println("enter initial value : ");
		v1=sc.nextLong();
		System.out.println("enter Depreciation Rate : ");
		r=sc.nextLong();
		System.out.println("enter  number of years : ");
		t=sc.nextLong();
		float v2 = (float)(v1* Math.pow((1 - r / 100), t));
		System.out.println("Value of V2/ Depreciation : " + v2);
	}
}
