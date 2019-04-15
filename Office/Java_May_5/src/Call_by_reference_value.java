class call_by_value{
	private int val1;
	private int val2;
	
	public void val(int a , int b) {
		val1 = a;
		val2 = b;
		val1 += 50;
		val2 += 100;
		System.out.println("Between Call value of val1: " + val1 + "and value of val2: " + val2 );
	}
}

class call_by_reference{
	int val1;
	int val2;
	
	call_by_reference(int a,int b){
		val1 = a;
		val2 = b;
	}
	
	public void ref(call_by_reference obj) {
		obj.val1 += 50;
		obj.val2 += 100;
		System.out.println("Between Call Value of val1: " + obj.val1 + " and value of val2: " + obj.val2 );
	}
}
public class Call_by_reference_value {
	
	public static void main(String args[]) {
		int val1 = 50, val2 = 100;
		call_by_value obj1 = new call_by_value();
		call_by_reference obj2 = new call_by_reference(val1,val2);
		
		System.out.println("Before Call: val1= " + val1 + " val2= " + val2);
		obj1.val(val1, val2);
		System.out.println("After Call: val1= " + val1 + " val2= " + val2);
		System.out.println(" ");
		
		System.out.println("Before Call: val1= " + obj2.val1 + " val2= " + val2);
		obj2.ref(obj2);
		System.out.println("After Call: val1= " + obj2.val1 + " val2= " + obj2.val2);
	}

}
