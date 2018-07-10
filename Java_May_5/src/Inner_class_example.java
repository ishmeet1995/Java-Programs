class outer_class{
	int outer_var = 10;
	
	public void method12(){
		System.out.print("Inside the outer class's method");
		inner_class obj1 = new inner_class();
		obj1.print1();
	}
	
	class inner_class{
		public void print1() {
			System.out.println("\nInside inner class and accessing outer variable " + outer_var);
		}
	}
	
}
public class Inner_class_example {
	
	public static void main(String args[]) {
		outer_class obj1 = new outer_class();
		obj1.method12();
	}

}
