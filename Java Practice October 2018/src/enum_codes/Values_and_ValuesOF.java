package enum_codes;

enum students{
	Ishmeet,Gurleen,Ria,Ram,Man
}
public class Values_and_ValuesOF {
	
	public static void main(String[] args) {
		students[] a1 = students.values();
		students a2 = null;
		for(students a : a1) 
			System.out.println(a);
		a2 = students.Ishmeet;
		System.out.println(a2.valueOf("Ishmeet"));
		System.out.println(a2.ordinal());
	}
}
