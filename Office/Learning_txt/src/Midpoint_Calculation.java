// Demonstrating how Looping statements are not required in while and for loops, and calculating the mid point of 2 numbers
public class Midpoint_Calculation {
	
	public static void main(String []args)  {
//		int a=0, b= 100;
//		
//				
//		while( ++a < --b);
//		
//		System.out.println("The midpoint is " + a);
		
		int a = 0;
		int b = 20;
		
		while (a < b) {
			if(!isEvenNumber(a)) {
				a++;
				continue;
			}
			else {
				System.out.println(a);
				System.out.println(a+ ": is a even number");
				a++;
			}
		}
	}
	
	public static boolean isEvenNumber(int number) {
		if((number % 2) == 0 ) {
			return true;
		}
		else 
			return false;
	}
}
