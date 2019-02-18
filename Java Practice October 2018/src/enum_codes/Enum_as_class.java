package enum_codes;

enum students1{
	Ishmeet(1000),Gurleen(20),Ria,Ram(40),Man(50);
	private int price;
	students1() {
		price = -1;
	}
	students1(int p){
		price = p;
	}
	int getPrice() {
		return price;
	}
}
public class Enum_as_class {
	
	public static void main(String[] args) {
		students1 a2 = null;
		a2 = students1.Ishmeet;
		System.out.println(a2.valueOf("Ishmeet"));
		System.out.println(a2.ordinal());
		
		System.out.println(a2.getPrice());
		System.out.println(a2.Ria.getPrice());
	}
}
