
public class Type_Conversion {
	public static void main(String []args) {
			int a=9;
			byte x,y;
			x = (byte) a;
			System.out.println(x);
			
			//y = x * 2;   type mismatch: cannot convert from int to byte
			y = (byte) (x * 2);
			
	}
}
