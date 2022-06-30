package Function;
//method overloading, multiple methods can have the same name with different parameters:	Example -int myMethod(int x)
//	e.g.	int myMethod(int x)
//	        float myMethod(float x)
//		    double myMethod(double x, double y)
//Instead of defining two methods that should do the same thing, it is better to overload one.
public class BasicMethodOverloadingExample {
	static int myMethod(int x, int y){
		return 10+x-y;
	}
	//we overload the myMethod method to work for both int, double and string.
	static double myMethod(double x,double y){
		return 100+x-y;
	}
	static String myMethod(String a , String b){
		return  a+b;
	}
	public static void main(String[]args){
		int n1=myMethod(20,5);
		int n2= myMethod(30,24);
		String n3=myMethod("Prerna","Sah");
		System.out.println("First  :" + n1);
		System.out.println("Second :" + n2);
		System.out.println("Third  :" + n3);
	}
}
