class parent_1{
	int i;
	int j;
	
	public void setij(int a,int b) {
		i = a;
		j = b;
		System.out.println("i= "+ i + " and j= " + j);
	}	
}

class child_1 extends parent_1{
	int k;
	
	public void setk(int a) {
		k = a;
		System.out.println("k= "+ k);		
	}
	
	public void sum2() {
		int x;
		x = i + j + k;
		System.out.println("Sum of " + i + ", " + j + " and " + k + " = " + x);
	}
}

public class inheritance_example1 {

	public static void main(String args[]) {
		
		parent_1 superobj = new parent_1();
		child_1 subobj = new child_1();
		superobj.setij(50, 60);
		subobj.setij(10, 20);
		subobj.setk(50);
		subobj.sum2();
		
		
	}
}
