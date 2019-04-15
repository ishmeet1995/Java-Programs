interface sum1{
	public int sum(int a,int b);
}

interface sub2 extends sum1{
	public int sub(int a,int b);
}

class calculator1 implements sub2{
	public int sum(int a,int b) {
		return(a+b);
	}
	public int sub(int a,int b) {
		return(a-b);
	}
}
public class Interface_example_4 {

}
