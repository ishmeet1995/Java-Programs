import java.util.Scanner;

public class Input_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Scanner is open");
		System.out.println("Enter a string");
		String string1 = scan.nextLine();
		System.out.println("Enter a int");
		int    int1    = scan.nextInt();
		System.out.println("Enter a char");
		char   char1   = scan.next().charAt(0);
		System.out.println("Enter a double");
		double double1 = scan.nextDouble();
		System.out.println(string1);
		System.out.println(int1);
		System.out.println(char1);
		System.out.println(double1);
		
		scan.close();

	}

}
