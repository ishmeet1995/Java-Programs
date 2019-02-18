package lambdaExpressions;

interface abc<T extends Number>{
	T factorial(T input);
	
}

public class Generic_Lambda_Func {
	public static void main(String[] args) {
		abc<Integer> lambda1 = (a) ->{
			int temp = 1;
			for(int i=1;i<=a;i++) {
				temp *= i; 
			}
			return temp;			
		};
		
		System.out.println(lambda1.factorial(5));
	}
}
