class test123{
	test123(){
		System.out.println("Inside the constructor");
		
	}
	protected void finalize() {
		System.out.println("inside finalize for object : " + this);
	}
}
public class finalizemerthd {

	public static void main(String args[]) {
		test123 obj1 = new test123();
		obj1 = null;
		System.gc();
		
	}
	
	
}

