public class Polymorphism_1{
	
	Polymorphism_1(){
		System.out.println("String only");
	}
	
	Polymorphism_1(java.lang.String x){
		System.out.println(x);
		
	}
	Polymorphism_1(int x){
		System.out.println(x + 2);
		
	}
	
	
	public static void main(java.lang.String [] args) {
		Polymorphism_1 P1 = new Polymorphism_1();
		Polymorphism_1 P2 = new Polymorphism_1("Gudhleen");
		Polymorphism_1 P3 = new Polymorphism_1(25);
		
		
	}
	
}