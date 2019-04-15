class parent_2{
	int a;
	int b;
	
	public void setab(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		int x;
		x = a + b ;
		System.out.println(x);
	}
}

class child_2 extends parent_2{
	int c = 10;
	
	public void sum() {
		int x;
		x = a + b + c;
		System.out.println(x);
	}
	
	public void subtract() {
		int x;
		x = a - b - c;
		System.out.println(x);
	}
	
}
public class inheritance_example_2 {

	public static void main(String args[]) {
		parent_2 obj1 = new child_2();
		child_2 obj2 = new child_2();
		obj1.setab(10, 20);
		obj1.sum();
		//obj1.subtract();
		obj2.setab(10, 20);
		obj2.subtract();
	}
}
