package hackerRankPractice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
	public static String findDay(int month, int day, int year) {
        
        Calendar cal = Calendar.getInstance();  //Initiate the calendar variable
        String returnDay = null;	//setting up the return variable
        cal.set(year,(month - 1),day);	// setting up new date
        Calendar.getInstance();
        SimpleDateFormat date1 = new SimpleDateFormat("EEE"); //Setting string format
        String day2 = date1.format(cal.getTime());
        day2 = day2.toUpperCase();
        switch (day2) {
        case "MON":
            returnDay = "MONDAY";                
            break;
        case "TUE":
            returnDay = "TUESDAY";                
            break;
        case "WED":
            returnDay = "WEDNESDAY";                
            break;
        case "THU":
            returnDay = "THURSDAY";                
            break;
        case "FRI":
            returnDay = "FRIDAY";                
            break;
        case "SAT":
            returnDay = "SATURDAY";                
            break;
        case "SUN":
            returnDay = "SUNDAY";                
            break;

        default:
            break;
        }
        
        return(returnDay);
}
}



public class CalendarPractice {
public static void main(String[] args) throws IOException {
    
    String[] firstMultipleInput = ("10 12 2019").split(" ");

    int month = Integer.parseInt(firstMultipleInput[0]);

    int day = Integer.parseInt(firstMultipleInput[1]);

    int year = Integer.parseInt(firstMultipleInput[2]);

    String res = Result.findDay(month, day, year);

    }
}