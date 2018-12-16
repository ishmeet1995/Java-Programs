class runnable_thread implements Runnable{
	Thread t;	//Defining Thread
	runnable_thread(){
		//Create a new thread
		t = new Thread(this,"Demo Thread"); // using thread's method Thread(Runnable threadObject, String threadName)
		System.out.println("New Thread's Constructor");
		t.start();
	}
	
	
	@Override
	public void run() {
		System.out.println(this);
		
			try {
				for(int i = 0; i <= 5 ; i++) {	
				t.sleep(1000);
				System.out.println("Inside the new thread at " + i);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		
		
	}
	
}
public class Thread_via_runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new runnable_thread();	// Creating a new thread.
		
		
		try {
			for(int i = 0; i <= 5 ; i++) {	
			Thread.sleep(500);
			System.out.println("Inside the Old thread at " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		

	}

}
