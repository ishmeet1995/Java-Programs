<<<<<<< HEAD
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



=======
public class test{
	public static void main(String args[]) {
		String a = "abc";
		String b = "           b";
		String c = "abc";
		int a2= 0;
		c.substring(0,4) = a2 ;
		
	}
}

>>>>>>> 0053e789ce7d9166023715e324485871cba6f959
