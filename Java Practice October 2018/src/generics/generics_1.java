package generics;

class test1<T> {
	T obj;
	test1(T obj1){
		obj = obj1;
	}
	
	
	public String print() {
		String a = "Hello " + obj;
		return(a);
		
	}
}


public class generics_1 {
	public static void main(String[] args) {
		test1<Integer> obj1 = new test1<Integer>(2);
		System.out.println(obj1.print());
	}

}
