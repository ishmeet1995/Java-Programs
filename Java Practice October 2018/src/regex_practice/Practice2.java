package regex_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice2 {
	public static void main(String[] args) {
		Pattern pat1 = Pattern.compile("[a-z]");
		Matcher matcher = pat1.matcher("hello world");
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
