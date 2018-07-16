interface A1{
	public int sum(int a,int b);
	
}

interface A2{
	public int subtract(int a,int b);
	
}

class calculator implements A2,A1{
	public int sum(int a,int b) {
		return(a+b);
	}
	
public int subtract(int a,int b) {
	return(a-b);
	}
}
public class Interface_example_1 {
	
	public static void main(String args[]) {
		calculator obj1;
		obj1 = new calculator();
		
		System.out.println(obj1.sum(3,4));
		System.out.println(obj1.subtract(5,4));
	}

}
