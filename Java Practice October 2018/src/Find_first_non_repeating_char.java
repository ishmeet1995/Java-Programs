import java.util.ArrayList;
import java.util.Scanner;

public class Find_first_non_repeating_char {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		scan.close();
		ArrayList<String> arr1 = new ArrayList<String>();
		System.out.println(str1.length());
		
		for(int i = 0 ; i < str1.length(); i++) {
			System.out.println(str1.substring(i,i+1));
			if(!arr1.contains(str1.substring(i, i+1))) 
				arr1.add(str1.substring(i,i+1));
			else 
				arr1.remove(str1.substring(i, i+1));			
		}
		
		
		
		
	
	}
}
