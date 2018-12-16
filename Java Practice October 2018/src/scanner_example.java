import java.util.*;
class test_123{
	int var1;
	
	test_123(){	// constructor without arguments
		var1 = 5;
		System.out.println("Value of varriable is " + var1);
	}
	
	test_123(int A){	// constructor with arguments
		var1 = var1 + A;
		System.out.println("Value of varriable is " + var1);
	}
	
	//
	int method_1(){
		var1 = var1 + 5;
		return(var1);
		
	}
	
	void method_2() {
		var1 = var1 + 5;
		
		System.out.println(var1);
	}
}




public class scanner_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner scan = new Scanner(System.in);
		double test_1;
		System.out.println("Enter a string");
		test_1 = scan.nextDouble();
		System.out.println("Stirng is " + test_1);
		
	*/
		test_123 obj1 = new test_123();
		test_123 obj2 = new test_123(50);
		System.out.println(obj1.method_1());
		obj1.method_2();
		
	}	

	
}
