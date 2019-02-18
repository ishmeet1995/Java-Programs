package enum_codes;

enum students3 {
	Ishmeet(50),hello(10),Ria(100);
	
	students3(int roll_no){
		
	}
}

public class Methods_of_Enum_class {

	public static void main(String[] args) {
		students3 s3;
		s3 = students3.hello;
		
		System.out.println(s3.ordinal());
		
		System.out.println(s3.compareTo(s3.Ria));
	
		students3 s2 = students3.Ria;
		System.out.println(s3.equals(s2) );
				
	}
}
