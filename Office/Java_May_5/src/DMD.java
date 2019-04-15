//Depending upon what class is the parent's reference obj is referring to appropriate method is called
class parent_6{
	public void print_1(){
		System.out.println("Inside Parent's Method");
	}
}

class child_6 extends parent_6{
	public void print_1(){
		System.out.println("Inside Child's Method");
	}
}
public class DMD {

	public static void main(String args[]) {
		parent_6 obj1;
		
		obj1 = new child_6();
		obj1.print_1();
		
		obj1 = new parent_6();
		obj1.print_1();
	}
}
