// //This code basically tells us how to implement wait() and notify()
// we have 2 methods, produce and consume. Each method is operated by seperate thread. 
// One loads data into the list and 2nd extracts it. The extractions start once the 
// list is full.

// Note For this to work both the threads need to be synchronized.

import java.util.*;
import java.util.ArrayList;

public class MultiThreading_7_Producer_consumer_problem {
	public static void main(String[] args) throws Exception{
		Prod_Cons obj1 = new Prod_Cons();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					obj1.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					obj1.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});	 
		//Start the threads.
		t1.start();
		t2.start();
		
		// Join the threads to main() so that main's thread ends when both threads are
		// processing
		t1.join();
		t2.join();
	}
	
}


 class Prod_Cons{
	 List<Integer> l1 = new ArrayList<Integer>();
	 final int size = 2;
	 public void producer() throws InterruptedException {
		 int value = 0;
		 while(true) {
			 synchronized (this) {
			 while(l1.size() == size) {
				 System.out.println("wait as stack is full");
				 wait();
			 }
			 System.out.println("continue loading the stack");

			 l1.add(value++);
			 System.out.println("added " + value);
			 
			 notify();
			 
			 Thread.sleep(1000);
			 }
		 }
	 }
	 
	 public void consumer() throws InterruptedException {
		 while(true) {
			 synchronized (this) {
			 while(l1.size() == 0) {
				 System.out.println("wait as stack is empty");

				 wait();
			 }
			 //This executed only of the other synchronized thread is on wait();
			 //Extracting the first element only.
			 System.out.println("Continue extracting stack");

			 System.out.println("Extracted "+ l1.remove(0));
			 
			 notify();
			 
			 Thread.sleep(1000);
			 }
			 
		 }
	 }
 }
