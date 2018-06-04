
public class Prime_Numbers_till_100 {

	
	boolean isPrime;
	
	public boolean check(int num) {
		isPrime = true;
		for (int i = 2; i <= num/i; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
			
		}
		return(isPrime);
	}
	
	public static void main(String args[]) {
		int num = 100;
		int i=2;
		boolean capture_result;
		
		Prime_Numbers_till_100 obj1 = new Prime_Numbers_till_100();
		while (i<=num) {
			capture_result = true;
			capture_result = obj1.check(i);
			
			if (capture_result) System.out.println(i);
			//else continue;
			
			i++;
		}
	}
	
}
