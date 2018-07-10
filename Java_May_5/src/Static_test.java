public class Static_test {
	static String name_1;
	static void man(String name){
		name_1 = name;
		System.out.println(name_1);
	}
	
	static {
		System.out.println("Static Block initialized");
		name_1 = "Initialized name";
		System.out.println(name_1);
	}
	public static void main(String arg[]) {
		man("Ishmeet");		
	}
	
}
