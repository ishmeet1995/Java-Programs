// Constructor chaining is the phenomenon in which one constructor is called from
// another constructor using constructor overriding concept.	
public class Constructor_chaining {
	
	
	Constructor_chaining(){
		this(25);
	}
	
	Constructor_chaining(int x){
		System.out.println(x);
	}
/*	
	public int constr(int x) {
		int a;
		a=x+1;
		return a;
	}*/			
	
	public static void main(String []args) {
		Constructor_chaining C1 = new Constructor_chaining();
	//	System.out.println(C1.constr(20));
	}
	

}
