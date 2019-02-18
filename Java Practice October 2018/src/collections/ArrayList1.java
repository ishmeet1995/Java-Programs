package collections;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[ ] args) {
		ArrayList<Integer> obj1  = new ArrayList<>();
		for(int i=0; i<=5; i++) {
			obj1.add(i);
		}
		System.out.println(obj1.size());
		obj1.trimToSize();
		System.out.println(obj1.size());
		
		
		Integer[] arr1= new Integer[obj1.size()];
		arr1 = obj1.toArray(arr1);
		System.out.println(obj1);
		System.out.println(arr1[1]);
		
	}

}
