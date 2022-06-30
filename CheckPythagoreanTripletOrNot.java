package Function;
import java.util.Scanner;
//A Pythagorean triplet is when the sum of the square of two numbers is equal to the
// square of the third number. e.g. 3^2 + 4^2 = 5^2
//9+16 = 25  . Hence, 3,4 and 5 are the Pythagorean triples.
public class CheckPythagoreanTripletOrNot {
	static void pythagorean(){
		Scanner in=new Scanner(System.in);
		System.out.print("a= ");
		int a= in.nextInt();
		System.out.print("b= ");
		int b= in.nextInt();
		System.out.print("c= ");
		int c= in.nextInt();
        int d=(a*a+b*b);
		System.out.println("ans = " + d);
		if(d==c*c)
			System.out.println("pythagorean");
		else
			System.out.println("not pythagorean");
	}
	public static void main(String[]args){
		pythagorean();
	}
}
