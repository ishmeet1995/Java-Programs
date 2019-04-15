class excep1 extends Exception{
	private int b;
	excep1(int a){
		b = a;
	}
	public String toString() {
		return "MyException[" + b + "]";
		}
}
public class Custom_exception  {
	static void compute (int a) throws excep1 {
		if (a>10)
			throw new excep1(a);
			
		
	}
	
	public static void main(String args[]) {
		try {
		compute(1);
		compute(20);
		} catch (excep1 e) {
		System.out.println("Caught " + e);
		}
	}
}
//Using predefined method of showing exception
//class excep1 extends Exception{
	
//	excep1(String a){
	
//		super(a);
	//}
	//
		
//}
//public class Custom_exception  {
	//static void compute (int a) throws excep1 {
		//if (a>10)
			//throw new excep1("Oh");
			
		
//	}
	//
	//public static void main(String args[]) {
		//try {
		//compute(1);
		//compute(20);
		//} catch (excep1 e) {
		//System.out.println("Caught " + e);
		//}
	//}
//}

