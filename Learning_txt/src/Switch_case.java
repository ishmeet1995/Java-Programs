// Add comment before every break statement and see what gets printed out. BREAKS ARE NECESSARY.
//Expected Outcome 
//i is 0
//i is 1
//i is 2
//i is 3
//i is 4
//i is 5
public class Switch_case {

	public static void main(java.lang.String []args) {
		
		for (int i = 0; i<6 ; i++) {
			switch(i) {
			case 0: System.out.println("i is 0");
					break;
			case 1: System.out.println("i is 1");
					break;
			case 2: System.out.println("i is 2");
					break;
			case 3: System.out.println("i is 3");
					break;
			case 4: System.out.println("i is 4");
					break;
			case 5: System.out.println("i is 5");
					break;
			default : System.out.println("This should not be printed");
			}
		}
		
		int a = 2;
		
		switch(a) {
		case 1 : case 2 : case 3 : 
			System.out.println("A = 2 or 3 or 1");
			break;
		case 4: System.out.println("A= 4");
				break;
		default : break;
	
		}
	}
}
