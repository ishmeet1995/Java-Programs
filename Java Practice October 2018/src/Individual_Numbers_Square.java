
public class Individual_Numbers_Square {
	static int squareing (int num_to_be_squared) {
		
		String str_hold = "";
		
		while(num_to_be_squared!=0) {
			int single_num = num_to_be_squared%10;
			str_hold = single_num * single_num + str_hold;
			num_to_be_squared /=10;
		}

		return Integer.parseInt(str_hold);
	}
	
	public static void main(String[] args) {
		System.out.println(squareing(9881));
	}
}
