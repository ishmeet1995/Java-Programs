
public class MultiThreading_4_Multiple_Threads implements Runnable  {
	String Name;
	Thread t;
	
	public MultiThreading_4_Multiple_Threads(String ThreadName) {
		Name = ThreadName;
		t = new Thread(this,Name);  
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int time = 0;
		if(t.getName().equalsIgnoreCase("thread1")) {
			time = 3000;
		}
		else if(t.getName().equalsIgnoreCase("thread2")) {
			time = 2000;
		}
		else if(t.getName().equalsIgnoreCase("thread3")) {
			time = 1000;
		}
		
		for(int i = 0; i<=5; i++) {
			try { t.sleep(time); } catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The thread " + t.getName() + " is "  + i);
		}

	}
	
	public static void main(String[] args) throws Exception {
		new MultiThreading_4_Multiple_Threads("thread1");
		new MultiThreading_4_Multiple_Threads("thread2");
		new MultiThreading_4_Multiple_Threads("thread3");
		
		Thread.sleep(100000); // to ensure it sleeps in the last and other threads are executed.
		
	}
	
	
}
