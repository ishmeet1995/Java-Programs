package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Iterator_1 {
	public static void main(String[] args) {
		 ArrayList<Integer> arr1 = new ArrayList<>();
		 //Loading array
		 for(int i = 0; i<=10;i++)
			 arr1.add(i);
		 
		 Iterator<Integer> itr = arr1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 System.out.println(arr1.size());
		 }
		 
	}
}
