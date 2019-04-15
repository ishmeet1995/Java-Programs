package generics;

class avg<T extends Number>{
	T[] internal_arr;
	avg(T[] arr){
		internal_arr = arr;
	}
	//Even though the input is of dynamic type. We will always return a specific type of input. This 
	// prevents ambiguity in long run.
	public double averages() {
		double final_avg = 0;
		for(int i = 0;i <= internal_arr.length - 1;i++) {
			final_avg += internal_arr[i].doubleValue();			
		}
		
		return final_avg/internal_arr.length;
	}
	
	public boolean average_compare(avg<?> obj) {
		if(averages() == obj.averages()) 
			return true;
		
		return false;
		
	}
}

public class generics_WildCard {
	public static void main(String[] args) {
		Integer[] int1 = {1,2,3,4,5};
		Double[]  dob1 = {1.0,2.0,3.0,4.0,5.1};
		
		
		Double w = new avg<Integer>(int1).averages();
		
		avg<Integer> integer = new avg<Integer>(int1);
		avg<Double>  dobb    = new avg<Double>(dob1);
		
		System.out.println(w);
		
		if(integer.average_compare(dobb)) {
			System.out.println(true);
		}
		else
			System.out.println(false);
		
		
	}
}