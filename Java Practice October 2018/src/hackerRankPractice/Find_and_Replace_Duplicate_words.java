//Ans= 
//(?i)\b(\w+)\s(\1(?!\w)(\s)?)+(\b)(\s)?

//Find and replace duplicate words. Each word has a word boundary so we have used \b to track it
// It helps us to avoid matches like "in inthe'.  
// (?i) is used to toggle REGEX to case insensitive mode.
// (\\1(?!\\w)(\\s)?) this part means that we need to find last matched word which must not be 
// Immediately followed by another word. but it can be followed by another space.

package hackerRankPractice;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find_and_Replace_Duplicate_words {

    public static void main(String[] args) {

        String regex = "(?i)\\b(\\w+)\\s(\\1(?!\\w)(\\s)?)+(\\b)(\\s)?";
        Pattern p = Pattern.compile(regex);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group().split(" ")[0] + " ");
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}

