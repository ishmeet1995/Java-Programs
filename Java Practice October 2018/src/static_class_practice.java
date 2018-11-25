
public class static_class_practice {
	static String var1;
	static void getname(String name) {
		var1 = name;
	}
	
	static String return_name() {
		return(var1);
	}

	public static void main(String args[]) {
		
		
		getname("name is ishmeet");
		
		System.out.println(return_name());
	}
}
