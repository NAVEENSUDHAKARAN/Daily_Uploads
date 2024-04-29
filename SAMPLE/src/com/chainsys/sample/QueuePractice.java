package com.chainsys.sample;

import java.util.PriorityQueue;

public class QueuePractice {

	public static void main(String[] args)
	{
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("Apple");
		queue.add("Mango");
		queue.add("orange");
		queue.add("Grapes");
		queue.add("Banana");
		queue.add("zanana");
		queue.add("canana");
		System.out.println("Queue : " + queue);
		System.out.println("Peek : " + queue.peek());

		System.out.println("Poll : " + queue.poll());
		System.out.println("Queue : " + queue);
		System.out.println("Remove : " + queue.remove("zanana"));
		System.out.println("Queue : " + queue);
//		System.out.println("Queue : " + queue);
//		
//		System.out.println("isEmpty? : " + !queue.isEmpty());
		
	}
}
