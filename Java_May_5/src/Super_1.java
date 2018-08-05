class parent_3{
	int variable_1 = 50;
	
	parent_3(){
		System.out.println("Inside the parent's constructor");// printed when child's constructor calls parent's const.
	}
	
	public void message() {
		System.out.println("Parent's method called");
	}
	
}

class child_3 extends parent_3{
	int variable_1 = 100;
	
	child_3(){
		super(); //Calling parent's constructor.
		System.out.println("Inside the child's constructor");
	}
	
	public void Variable_test() {
		System.out.println("\nChild's variable value: " + variable_1); // this prints the variable of this i.e child class.
		System.out.println("Parent's variable value: " + super.variable_1);// this prints the variable of parent class.
	}
	
	public void message() {   
		System.out.println("\nChild's method called");
		super.message();
	}
	
}
public class Super_1 {

	public static void main(String args[]) {
		child_3 child_obj = new child_3();
		child_obj.Variable_test();
		
		child_obj.message();
		
		
		
	}
}
