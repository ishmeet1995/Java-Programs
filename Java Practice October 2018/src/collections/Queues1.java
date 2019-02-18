package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues1 {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		for(int i = 0; i <=5;i++)
			q1.add(i);
		int head = q1.remove();
		System.out.println(head);
		int a = q1.peek();
		System.out.println(a);
	}

}
