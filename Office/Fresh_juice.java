// This program makes use of the Enum function of  JAVA.

class juice_size{
	enum FreshJuiceSize{Small, Medium, Large} // Declared enum variable 
	FreshJuiceSize size; 
}


public class Fresh_juice {
	
	public static void main(String []args)
	{
		juice_size juice = new juice_size();
		juice.size = juice_size.FreshJuiceSize.Medium;
		System.out.println("Size= "+ juice.size);
	}
	
}
