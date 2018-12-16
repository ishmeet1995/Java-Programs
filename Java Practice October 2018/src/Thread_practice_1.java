
public class Thread_practice_1 {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.currentThread();
		System.out.println("current thread = " + t);
		t.setName("Ishmeet's Thread");
		System.out.println("current thread = " + t);
		try {
			Thread.sleep(1000);
			System.out.println("Print");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Main Thread interrupted");
		}
		
		
	}

}
