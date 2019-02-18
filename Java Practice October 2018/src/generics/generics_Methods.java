package generics;

public class generics_Methods {
	static <T> 	void  test1 (T input){
		System.out.println(input);
		
	}
	
	public static void main(String[] args) {
		generics_Methods.test1(123);
	}
}
