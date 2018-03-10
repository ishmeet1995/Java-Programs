// Showing that how Underscored can exsist in data type initialization of large numbers, and how to use Math method.
public class Literals2 {

	public static void main(String []args) {
		int x = 243_454_343;
		System.out.println(x + 1);
		 x = Math.addExact(x, 5);
		System.out.println(x);
	}
}
