
public class Thread_practice_1 {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.currentThread();
		System.out.println("current thread = " + t);
		t.setName("Ishmeet's Thread");
		System.out.println("current thread = " + t);
		try {
<<<<<<< HEAD
			t.sleep(1000);
=======
<<<<<<< HEAD
			t.sleep(1000);
=======
			Thread.sleep(1000);
>>>>>>> 0053e789ce7d9166023715e324485871cba6f959
>>>>>>> a45c3d0da3caf1d4278cc9ad23a54fca350c4137
			System.out.println("Print");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Main Thread interrupted");
		}
		
		
	}

}
