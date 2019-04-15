class boxx {
	private int height;
	private int width;
	private int depth;
	
	boxx(int h, int w, int d){					//box's constructor
		height = h;
		width = w;
		depth = d;
	}
	
	public int volume() {
		int output;
		output = height * width * depth;
		return(output);
		}
	
	
}
public class constructor_2 {
	
	public static void main(String args[]) {
		boxx obj1 = new boxx(100,20,10);
		boxx obj2 = new boxx(90,10,5);
		
		System.out.println("The volume of box1 is " + obj1.volume() );
		System.out.println("The volume of box2 is " + obj2.volume() );
	}
	

}
