package lambdaExpressions;

interface abc2{
	int lambda1(String a);
}

public class InLine_Lambda_Function {
	static int get_Length(abc2 expr, String str1) {
		return expr.lambda1(str1);
	}
	public static void main(String[] args) {
		
		System.out.println(get_Length((s) -> s.length(), "Hello"));
		
	}
}
