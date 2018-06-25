class test{
	private int height = 1;
	private int width = 2;
	private int depth = 3;
	
	void set(int height,int width,int depth) {
		this.height = 10; 
		this.width = 20;  
		this.depth = 30;  
		System.out.println(this);  		// Printing Object's key
	}
	
	public void print() {
		System.out.println(height*width*depth);
	}
	
	
}

public class this_1 {

	public static void main(String args[]) {
		test obj1 = new test();
		obj1.set(10, 20, 30);
		obj1.print();
		
	}
	
}
