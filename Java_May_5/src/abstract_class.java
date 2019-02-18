abstract class parent_7{
	 abstract void print_2() ;
}

class child_7 extends parent_7{
	
	void print_2() {
		
		System.out.println("Inside Child's method");
	}
}
public class abstract_class {
	
	public static void main(String args[]) {
	
		parent_7 obj1 = new child_7();
		obj1.print_2();
	}

}
