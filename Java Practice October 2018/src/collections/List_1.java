package collections;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
	
	public static void main(String [] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1.indexOf(4));
		System.out.println(l1.get(2));
		
		l2.addAll(l1);
		
	}

}
