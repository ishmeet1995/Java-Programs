class divide_zero{
	int divide_method(int a) {
		return(100/a);
	}
}
public class Divide_by_zero_exceptions {

	public static void main(String args[]) {
		divide_zero obj = new divide_zero();
		System.out.println(obj.divide_method(5));
		System.out.println(obj.divide_method(0));
	}
}
