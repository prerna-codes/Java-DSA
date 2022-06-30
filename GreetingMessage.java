package FirstJavaProgram;
//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class GreetingMessage {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String n= in.nextLine();
		System.out.println("Hello " + n + ", welcome to my channel. ");


	}
}
