class polymorph{
	public int operation(int i)
	{
		return(5);
	}
	public String operation(String i)
	{
		return("This is string");
	}
	public char operation(char i)
	{
		return('c');
	}
	
}
public class Polymorphism_1 {
	public static void main(String args[]) {
		polymorph obj1 = new polymorph();
// Printing out the result
		System.out.println("number is" + obj1.operation(5));
		System.out.println(obj1.operation("Hello"));
		System.out.println("Character is" + obj1.operation('F'));
	
		
	}
}
