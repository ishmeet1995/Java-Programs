interface sharedConstants{
	int NO = 0;
	int Yes = 1;
	int Later = 2;
}


public class Interface_example_3 implements sharedConstants{

	public static void main(String args[]) {
		System.out.println("Value of NO: " + NO);
		System.out.println("Value of Yes: " + Yes);
		System.out.println("Value of Later: " + Later);
		NO = 1;
	}
}
