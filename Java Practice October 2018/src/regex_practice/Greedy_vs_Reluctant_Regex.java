package regex_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greedy_vs_Reluctant_Regex {
	public static void main(String[] args) {
		//Greedy Quantifier
		// firstly it looks for 'e' and then '.*' selects everything till end and then 'd' is 
		// searched while backtracking the string
		Pattern pat1 = Pattern.compile("e.*d");
		Matcher match1 = pat1.matcher("hat extend cup ends");
		while(match1.find()) {
			System.out.println(match1.group());
		}
		
		//Reluctant Quantifier
		//firstly it looks for 'e' and then '.*?' tells that you have to look every char in string 
		// one by one sequentially and then we look for a 'd' 
		// o/p1 = extend (due to end in it_)
		// o/p2 = end
		Pattern pat2 = Pattern.compile("e.*?d");
		Matcher match2 = pat2.matcher("hat extend cup end");
		
		while(match2.find()) {
			System.out.println(match2.group());
			System.out.println(match2.start());
			System.out.println(match2.end());
			
		}
		
	}

}
