package StackClassOfpakageJava;

import java.util.PriorityQueue;

public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue< Double > queue = new PriorityQueue< Double >();
		
		queue.offer(2.2);
		queue.offer(3.2);
		queue.offer(4.3);
		queue.offer(5.4);
		System.out.print( "Polling from queue: " );
		System.out.println();
		while(queue.size()>0){
			
			System.out.println(" "+queue.peek());
			queue.poll();
		}
		
	}

}
