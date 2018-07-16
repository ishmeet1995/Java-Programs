class factorial{
	int a = 1;
	public int fact(int n) {
		a *= n;
		
		if(n != 1)			//Recursive loop
			fact(--n);		
		return a;	
	}
}
public class Recursion_1_factorial {

	public static void main(String args[]) {

		factorial obj1 = new factorial();
		System.out.println("The factorial for 3 is " + obj1.fact(3));
	}
}
