class car{
	int wheel = 4;
	int body = 1;
	int seat = 4;
}

class maruti extends car{
	int company = 1;
	int price = 200000;
}

class maruti800 extends maruti{
	boolean best_car_in_world = true;
}
public class multiple_inheritance {
	
	public static void main(String args[]) {
		maruti800 maruti_obj = new maruti800();
		
		System.out.println("Is 800 the best car in world" + maruti_obj.best_car_in_world);
		System.out.println("Its price" +maruti_obj.price);
		System.out.println("It has " + maruti_obj.seat + " seats");
		
	}

}
