//Here we are going to use the divide by zero concept to illustrate 'try' and 'catch'

class divide_by_zero {
	void divide_method(int a) {
		try{
			System.out.println((100/a));
		}catch (ArithmeticException e) {
			System.out.println("Not allowed to divide by zero"); // to print the valid response.
			System.out.println(e); // to see what exception occurred
		}
	}
	
}
public class Exception_try_catch {
	public static void main(String args[]) {
		divide_by_zero obj = new divide_by_zero();
		obj.divide_method(5);
		obj.divide_method(0);
	}
}
