class IE_1{
	public interface calculator{
		public int sum(int a, int b);
		public int subtrat(int a, int b);
		default void display() {
			System.out.println("s");
		}
	}
}

class IE_2 implements IE_1.calculator{
	public int sum(int a, int b) {
		return(a+b);
	}
	public int subtrat(int a, int b) {
		return(a-b);
	}
}

public class Interface_example_2 {
		
	public static void main(String args[]) {
		IE_1.calculator obj1 = new IE_2();
		
		System.out.println(obj1.sum(5, 6));
		System.out.println(obj1.subtrat(10, 6));
	}
}
