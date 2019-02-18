package lambdaExpressions;

public class Lambda_Method_References {
	public static void main(String[] args) {
		//Traditional Way of calling a reference.
		Thread t1 = new Thread(()-> method_1());
		
		//Calling method via method reference.
		Thread t2 = new Thread(Lambda_Method_References::method_1);
		
		t1.start();
		t2.start();
		
	}
	
	private static void method_1() {
		System.out.println("Inside static method");
	}
}
