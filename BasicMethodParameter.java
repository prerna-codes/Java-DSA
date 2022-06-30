package Function;
public class BasicMethodParameter {
	static void myMethod(String name,int age){

		System.out.println("Hello,my name is "+ name +" and my age is "+age );
	}
	public static void main(String[]args){
		myMethod("Prerna",22);
		myMethod("Ram",23);
		myMethod("Anuj",27);
	}
}
