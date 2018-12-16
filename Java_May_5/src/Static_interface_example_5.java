interface static_interface{
	int sum();
	
	static String callme() {
		return("Inside Static Method of Interface");
	}
}
public class Static_interface_example_5 {
	
	public static void main(String args[]) {
		
		System.out.println(static_interface.callme());
	}

}
