class overload{
	public void test() {
		System.out.println("We are in method with no parameters");
	}
	
	public void test(int a, int b) {
		System.out.println("We are in method with parameters");
	}
}
public class Overloading_1{
	
	public static void main(String args[]) {
		overload a;
		a = new overload();
		
		a.test();
		a.test(54, 50);
		
	}

}
