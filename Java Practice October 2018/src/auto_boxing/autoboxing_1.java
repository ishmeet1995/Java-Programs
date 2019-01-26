package auto_boxing;

public class autoboxing_1 {
	public static void main(String[] args) {
		Integer a = new Integer(100); // without auto-boxing
		Integer b = 100; //With auto boxing
		int a1 = a.intValue(); // Un-Boxing
		int b1 = b; // auto un-boxing
		
	}
}
