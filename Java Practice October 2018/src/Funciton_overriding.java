class overriding{
	public void sum(int a, int b) {
		System.out.println(a + b);
	}
}

class overriding2 extends overriding {
	
	public void sum(int c, int d) {
		System.out.println(c * d); // child's sum funcyion overrides the parent's function
	}
	
}

public class Funciton_overriding {
	public static void main(String args[]) {
		overriding2 obj1 = new overriding2();
		obj1.sum(5, 10);
		
	}
}
