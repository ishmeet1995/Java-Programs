
public class Polymorphism_2 {

	Polymorphism_2 () {
	    System.out.println("Print Only");
	}
	
	Polymorphism_2 (int x) {
		System.out.println("Only One Number" + x);
	}
	
	Polymorphism_2 (int x , int y) {
		System.out.println("Adding Two Numbers" + (x + y));
		}
	
	Polymorphism_2 (java.lang.String z) {
		System.out.println( z +  "Please Shut Up!");
		}
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		Polymorphism_2 P1 = new Polymorphism_2();
		Polymorphism_2 P2 = new Polymorphism_2(1);
		Polymorphism_2 P3 = new Polymorphism_2(1,2);
		Polymorphism_2 P4 = new Polymorphism_2("Ishmeet Bindra");
		

	}
	

}
