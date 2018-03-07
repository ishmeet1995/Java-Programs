//Funtion Overriding
 class test {
	
	public void move()
	{
		System.out.println("Main");
		
	}
	
	
}

class Polymorphism2 extends test {
	public void move() {
		System.out.println("Sub");
	}
}


public class Polymorphism1{
	public static void main(String []args) {
		test P1 = new Polymorphism2();
		P1.move();
		P1 = new test();
		P1.move();
		
	}
}