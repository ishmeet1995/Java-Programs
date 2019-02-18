package hackerRankPractice;


	import java.util.Scanner;

	public class RegEx2 {

	    public static void main(String[] args){
	        @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
	}

	//Write your code here
	class MyRegex{
	   
	        String pattern = "([0-1]\\d\\d|2[0-4]\\d|25[0-5]|\\d\\d|0)\\.([0-1]\\d\\d|2[0-4]\\d|25[0-5]|\\d\\d|0)\\.([0-1]\\d\\d|2[0-4]\\d|25[0-5]|\\d\\d|0)\\.([0-1]\\d\\d|2[0-4]\\d|25[0-5]|\\d\\d|0)";
	   
	}
