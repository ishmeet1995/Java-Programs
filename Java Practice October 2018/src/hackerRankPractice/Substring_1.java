package hackerRankPractice;
import java.util.Scanner;

public class Substring_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		int length = scan.nextInt();
		scan.close();
		java.util.ArrayList<String> arr1 = new java.util.ArrayList<>();
		
		
		for(int j = 0; j<= str1.length()-length;j++) {
			
			
					arr1.add(str1.substring(j,j+length ));
				
				
			}
			
			
		
		
		java.util.Collections.sort(arr1);
		System.out.println(arr1.iterator().next());
		System.out.println(arr1.get(arr1.size()-1));
		
		
	}
}
