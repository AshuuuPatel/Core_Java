package com.stact_queue;

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(2);
		queue.add(1);
		queue.add(3);
		queue.add(3);
		
		System.out.println(queue);
		
		queue.remove();
		System.out.println("After remove : "+queue);
		
		Integer head = queue.peek();
		System.out.println("Head of the Queue : "+head);
		
		System.out.println("Head of the Queue : "+queue.peek());
		
		head = queue.poll();
		System.out.println("removed head : "+head);
		
		System.out.println("remaining : "+queue);
		
		System.out.println("removed head : "+queue.poll());

	}
	
}
