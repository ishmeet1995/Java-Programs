package regex_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice_1 {
	public static void main(String[] args) {
		Pattern pat1 = Pattern.compile("Is.....");
		Matcher match1 = pat1.matcher("Ishmeet Ishmeet Isah");
		
		while(match1.find()) {
			System.out.println(match1.group());
			System.out.println(match1.start());
			System.out.println(match1.end());
		}
	}
}
