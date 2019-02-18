package lambdaExpressions;

import java.util.ArrayList;

public class Lambda_for_Each {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		
		arr1.forEach((n)->{
			System.out.println("hello" + n);
		});
		
	}

}
