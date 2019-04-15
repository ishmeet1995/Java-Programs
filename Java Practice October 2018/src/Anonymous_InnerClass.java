interface interf1{
	int sum(int a,int b);
}
public class Anonymous_InnerClass {
	
	public int add(int a , int b) {
		return(a+b);
	}
	
	public static void main(String[] args) {
		//Anonymous inner class for Interface
		interf1 obj1 = new interf1() {
			
			@Override
			public int sum(int a,int b) {
				
				return a+b;
			}
		};
		
		//Anonymous inner class for Class (Implemented method overriding without new class)		
		Anonymous_InnerClass obj2 = new Anonymous_InnerClass() {
			public int add(int a , int b) {
				return(a+b+5);
			}
			
		};
		
		System.out.println(obj1.sum(5, 6));
		System.out.println(obj2.add(5, 6));
	}
}