
public class Multiplication_by_2_using_left_shift {
	
	public static void main(String []args) {
		int b = 0b00000001;
		
		for (int a =0; a<4; a++)
		{
			System.out.println(b);
			b <<= 1;
		}
	}
	
}
