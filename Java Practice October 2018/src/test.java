import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Pattern pat1 = Pattern.compile("(?:<(.+)>)([^<])+(?=(<\\/(\\1)>))");
			Matcher match1 = pat1.matcher(line);
			if(match1.find()) {
				System.out.println(match1.group().split(">")[1]);
			}
			else {
				System.out.println("None");
			}
			
          	//Write your code here
			
			testCases--;
		}
	}
}



