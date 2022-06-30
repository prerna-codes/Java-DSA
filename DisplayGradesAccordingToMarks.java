package GfgMiscellaneous;

import java.util.Scanner;

public class DisplayGradesAccordingToMarks {
	static void grade(){
		Scanner in=new Scanner(System.in);
		int s=0; float percent;
		System.out.print("Enter no of subjects : ");
		int n= in.nextInt();
		System.out.println("Enter marks : ");                   //Incomplete
		for (int i=1;i<=n;i++){
			int m= in.nextInt();
			 s=s+m;
		}
		System.out.print("Total Marks : " + s);
		percent = (s / (n * 100)) * 100;
		System.out.print("Percentage : " + percent);
		}
	public static void main(String[]args){

		grade();
	}
}
