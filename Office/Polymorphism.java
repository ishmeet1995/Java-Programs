//polymorhism example
public class Polymorphism {

	Polymorphism(){
		System.out.println("Simple const");
	}
	Polymorphism(String x){
		System.out.println(x);
	}
	
	Polymorphism(int x){
		int a = x +1;
		System.out.println(a);
	}
	
	public static void main(String []args) {
		Polymorphism P1 = new Polymorphism();
		Polymorphism P2 = new Polymorphism("a");
		Polymorphism P3 = new Polymorphism(25);
	}
	
}
