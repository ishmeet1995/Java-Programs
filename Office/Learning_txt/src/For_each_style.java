// Here we are going to discuss the for-each style code which is implemented in C#
public class For_each_style {

	public static void main(String []args) {
		int sum=0;
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0 ; i < 10 ; i++) {
			sum += nums[i];
			System.out.println(sum);
		}
		
		sum = 0;
		System.out.println("Alternative approach");
		
	
		for (int j : nums) {		// Now 'j' will have different values of nums array and this will go on till nums's 
		//	sum += j;		    				last item is received
			System.out.println(sum += j);
		}
	}
	
}
