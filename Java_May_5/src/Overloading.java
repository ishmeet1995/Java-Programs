//This is an example of Inheritence 
class parent{
	public void m1() {
		System.out.println("Parent");
	}
	
}

class child extends parent{
	public void m1() {
		System.out.println("Child");
	}
}

public class Overloading {

	public static void main(String args []) {
		parent obj1 = new child();
		obj1.m1();
		obj1 = new parent();
		obj1.m1();
	}
	
}
