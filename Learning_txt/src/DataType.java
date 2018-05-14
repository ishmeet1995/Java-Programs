// Program to test data types.
public class DataType {
	
	public static void main(String []args)
	{
		boolean i = true;
		byte x=126;
		char y = 'a';
		char z = '\u0061';	//Unicode for a
		
		///Boolean Test///////////////////////////
	//	i = false;
		if (i == true) {
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		System.out.println((10<9));
		System.out.println(10+9);
		
		//////////////////////////////////////////
		/// Byte test//////////////////
		x += 1;
		System.out.println(x);    //It increments till 127
		x += 1;
		System.out.println(x);	  // After it goes into 2's compliment with a negative sign.	
		x += 1;
		System.out.println(x);
		x += 1;
		System.out.println(x);
		////////////////////////////////////////////
		///Char Test////////////////////////////////
		System.out.println(y);
		System.out.println(z);
		////////////////////////////////////////////
		
	}
	
	
}
