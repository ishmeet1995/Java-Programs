package lambdaExpressions;

interface lambda_test{
	void hello(int a);
	
}

public class Practice_1 {
	public static void main(String[] args) {
		lambda_test ablockofcode = (int a) ->{
			System.out.println("Hello" + a);
		};
		
		ablockofcode.hello(5);
		
		lambda_test innerclass_1 = new lambda_test() {

			@Override
			public void hello(int a) {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
}
