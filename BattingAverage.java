package ConditionalLoops;
// Average Batting = run scored/Number of times batsman was dismissed
//Number of times batsman was dismissed = matches - not out
import java.util.Scanner;
public class BattingAverage {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int match,not_out,dissmised,run;
		float avg;
		System.out.print("enter run scored : ");
		run =sc.nextInt();
		System.out.print("enter not out : ");
		not_out=sc.nextInt();
		System.out.println("enter  matches : ");
		match=sc.nextInt();
		dissmised= match-not_out;
		avg= run/dissmised;
		System.out.println("Batting average : " + avg);
	}
}
