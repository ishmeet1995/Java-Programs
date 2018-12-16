
public class Exception_multiple_try {

	public static void main(String args[]) {
		int a = 0;
		
		try {
			System.out.println(a/100);
			try {
				System.out.println(200/a);
			}catch(Exception e) {
				System.out.println("Inner Catch");
			}
		}catch(ArithmeticException e) {
			System.out.println("Outer Catch");
		}
	}
}
