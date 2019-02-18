package hackerRankPractice;

public class Palindrome {
	public static void main(String args[]) {
		
		String input = "madam";
		String[] srt_array = input.split("");
		String[] output_array = new String[srt_array.length];
		String output = "";
		
		int i = 0;
		
		i = srt_array.length - 1;
		
		for(String arr : srt_array) {
			output_array[i] = arr;
			i--;
		}
		
		for(String arr : output_array)			
			output += arr;
		
		if(output.equalsIgnoreCase(input)) {
			System.out.println("Bingo");
		}
		else {
			System.out.println("Nope");
		}
		
		
		
		
		
		
		
	}

}
