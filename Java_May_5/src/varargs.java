
public class varargs {
static int count = 0;
	static void print1(int ...a) {
		count = 0;
		for (int x : a) {
			System.out.println(x);
			count++;
		}
		System.out.println("Count = " + count);
		
	}
	public static void main(String args[]) {		
		
		print1(2);
		print1(1,2);
		print1(1,2,3);
		print1(1,2,3,4);
		
	}
}
