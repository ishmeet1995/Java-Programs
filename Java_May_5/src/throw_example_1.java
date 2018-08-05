class throwables {
	public void prints() {
		try {
			throw new ArithmeticException("DEMO"); // throwing a custom exception
			
		}catch(ArithmeticException e) {
			System.out.println("Inside the demo throw");
			throw e; // throwing a custom exception
		}
	}
}
public class throw_example_1 {
	
	public static void main(String args[]) {
		throwables obj_1 = new throwables();
		try{
			obj_1.prints();
		}catch (ArithmeticException e) {
			System.out.println("Ok now in outer catch");
		}
	}

}
