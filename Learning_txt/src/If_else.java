//Practicing different types of if and else

public class If_else {

	public static void main(java.lang.String []args) {
		int a = 2;
		int b = 3;
		int c = 4;

// Normal IF ELSE
		if (a == 2) 
			System.out.println(a);
		else
			System.out.println(a);

// LADDER IF ELSE
		if (a == 3) 
			System.out.println(a);
		else if (b == 3)
			System.out.println(b);
		else if (c == 4)
			System.out.println(b);
		else
			System.out.println("FALSE");
			
// Nested If Else
		if (a == 2) {
			if (b == 3) {
				if (c == 4) {
					System.out.println("Yeah Baby");
				}
			}
		}
	}
	
}
