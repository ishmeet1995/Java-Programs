package enum_codes;

enum Apple{
	GoldenDel,Red,Green,Blue
}

public class Enumeration_constants {
	public static void main(String[] args) {
		Apple ap = Apple.GoldenDel;
		System.out.println(ap);
		ap = ap.Green;
		
		if(ap == Apple.Green) {
			System.out.println(ap);
		}
		
		switch(ap) {
		case GoldenDel:
				System.out.println("Golden");
				break;
					
		case Green:
			System.out.println("Green");
			break;
			
		case Blue:
			System.out.println("Blue");
			break;
			
		case Red:
			System.out.println("Red");
			break;
			
		default:
			System.out.println("Incorrect");
			
			
			
		}
	}
}
