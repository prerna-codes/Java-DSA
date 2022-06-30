package ConditionalLoops;
//Calculate cgpa= CGPA Percentage = " cgpa * 9.5
//CGPA = (Grades in all Subjects) / (Total Number of Subjects).
//grade[i]=(marks[i]/10)
import java.util.Scanner;
public class Cgpa {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//int mark;
		System.out.println("Marks Scored :");
		System.out.println("Enter no of subjects  :");
		int n= sc.nextInt();
		double sum=0;double grade,mark = 0,cgpa;
		for(int i=0;i<n;i++){
			System.out.print("Enter marks :");
		 mark= sc.nextInt();
		 sum = mark + sum;
		}
		System.out.println("sum of marks : "+ sum);
		grade=mark/10;
		sum+=grade;
		 cgpa= sum/n;
		System.out.print("Cgpa :" + cgpa);
		System.out.println("percantage from cgpa="+cgpa*9.5);//Not correct
	}
}
