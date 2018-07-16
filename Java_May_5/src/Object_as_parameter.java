class obj_a_param{
	private int a;
	private int b;
	
	public void set(int inp1, int inp2) {
		a = inp1;
		b = inp2;
	}
	
	public void show(obj_a_param object) {
		System.out.println("object.a: " + object.a + " Object.b: " + object.b );
	}
}
public class Object_as_parameter {
	
	public static void main(String args[]) {
		
		obj_a_param obj1 = new obj_a_param();
		obj_a_param obj2 = new obj_a_param();
		
		obj1.set(50, 60);
		obj2.set(90, 100);
		
		obj1.show(obj1);		//Passing obj1 as parameter for calling obj1
		obj2.show(obj2);		//Passing obj2 as parameter for calling obj2
		obj2.show(obj1);		//Passing obj1 as parameter for calling obj2
		
	}

}
