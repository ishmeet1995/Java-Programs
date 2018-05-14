
public class Operators {
	public static void main(String []args) {
		int a=5;
		int b=6;
		int d = -1;
		boolean c;
		if ((a >= 5) && (b < 8 )) {
			System.out.println("AND");
		}
		
		if ((a >= 6) || (b < 8 )) {
			System.out.println("OR");
		}
		c = false;
		if (c = true) {
			System.out.println("Truee Truee");
			
		}// In this case we are assigning value to the boolean character 'C' instead of checking it. During an assignment in 'IF' it 
		 // simply just looks for the returned value after assignment.
		
		d >>= 6;
		System.out.println(d);
	}
}
