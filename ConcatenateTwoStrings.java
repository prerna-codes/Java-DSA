package GfgMiscellaneous;
import java.util.Scanner;
public class ConcatenateTwoStrings {
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter two Strings : ");
		 String a= in.nextLine();
		 String b= in.nextLine();
		 String c="Hello ,Prerna ";
		 String d="Sah";
		 System.out.println(a+b);
		 System.out.println(c.concat(d));


	 }
}
