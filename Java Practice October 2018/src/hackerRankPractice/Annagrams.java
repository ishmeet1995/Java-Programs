/*
 * This is a smaller solution but an inefficient one as every element of array is compared one by one
	Arrays.sort(a);
	Arrays.sort(b);
	return Arrays.equals(a,b);
*/



package hackerRankPractice;
import java.util.HashMap;


public class Annagrams {

	public static void main(String[] args) {
		String   string1    = "Abul",         string2  = "BulA";
		String[] arr1       = string1.split(""), arr2     = string2.split("");
		boolean  hasNext    = false;
		boolean  mismatch   = true;
		boolean  isDone     = false;
		int arr_len =0;
		HashMap<String, Integer> a1 = new HashMap<String, Integer>();
		HashMap<String, Integer> a2 = new HashMap<String, Integer>();
		
		//Build Hashmap for first string
		arr_len = arr1.length;
		for(int i= 0 ; i< arr_len ; i++) {
			if(a1.containsKey(arr1[i])) {
				a1.put(arr1[i].toLowerCase(), a1.get(arr1[i].toLowerCase()) + 1 );
			}
			else
				a1.put(arr1[i].toLowerCase(), 1);
		}
		
		//Build Hashmap for 2nd string.
		arr_len = arr2.length;
		for(int i= 0 ; i< arr_len ; i++) {
			if(a2.containsKey(arr2[i])) 
				a2.put(arr2[i].toLowerCase(), a2.get(arr2[i].toLowerCase())+ 1 );
			else
				a2.put(arr2[i].toLowerCase(), 1);
			
		}
		
		
		
		int hashSize = a1.size();
		if (hashSize > 0 && arr1.length == arr2.length) {
            hasNext = true;
            mismatch = false;
            isDone = false;
        }
        else{
            hasNext = false;
            mismatch = true;
            isDone = true;
        }
		
		while(hasNext && !mismatch && !isDone ) {
			for(int i = 0; i< hashSize ; i++) {
				if((a1.get(arr1[i].toLowerCase()) != null) && (a2.get(arr1[i].toLowerCase()) != null)
						&& (a1.get(arr1[i].toLowerCase()) == a2.get(arr1[i].toLowerCase())))
					{mismatch = false;}
				else
					{mismatch = true;
						break;}		
			}
			
			isDone = true;
		}
		
		
				
	}

}

