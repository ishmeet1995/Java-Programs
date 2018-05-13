// So the big idea is without using a public method such as setName we cannot update or access private variables of class 'encap'. So yea!!!
// See how variable 'hello' is getting printed.
class encap {
	private int age;
	private String name;
	public String hello;
	
	public void setAge (int X)	{
		this.age = X;
	}
	
	public void setName(String N) { 
		name = N;
	}
	
	public String getName() {
		return(name);
	}

	public int getAge() {
		return(age);
	}
}
public class Encapsulation {
	
	public static void main(String args []) {
		encap OBJ_1 =  new encap();
		OBJ_1.setAge(50);
		OBJ_1.setName("Ishmeet");
		OBJ_1.hello = "oh yeah!";
		//OBJ_1.name = "oh yeah!";
		
		
		System.out.print("The name of the person is " + OBJ_1.getName() + " and his age is: " + OBJ_1.getAge() + "And this is Public variable  " + OBJ_1.hello);
		
	}

}
