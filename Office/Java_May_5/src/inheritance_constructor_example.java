class parent_5{
	parent_5(){
		System.out.println("Inside Parent's constructor");
	}
}

class child_5 extends parent_5{
	child_5(){
		System.out.println("Inside child's constructor");
	}
}

class random_1 extends child_5{
	random_1(){
		System.out.println("Inside random_1 constructor");
		
	}
}

public class inheritance_constructor_example {
	
	public static void main(String args[]) {
		new random_1();
	}
}
