class box {
	private int height;
	private int width;
	private int depth;
	
	box(){					//box's constructor
		height = 100;
		width = 10;
		depth = 20;
	}
	
	public int volume() {
		int output;
		output = height * width * depth;
		return(output);
		}
	
	
}
public class constructor_1 {
	
	public static void main(String args[]) {
		box obj1 = new box();
		
		System.out.println("The volume of box is " + obj1.volume() );
	}
	

}
