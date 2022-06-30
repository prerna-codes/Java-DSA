package Function;
//use a primitive data type (such as int, char, etc.) instead of void,and use the return
// keyword inside the method.
public class BasicReturnValue {
	static int myMethod(int x,int y){
		return 10+x-y;
	}
	public static void main(String[]args){
		System.out.println("Value =" + myMethod(20,5));
	}
}
