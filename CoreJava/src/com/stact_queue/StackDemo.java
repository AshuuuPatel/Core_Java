package com.stact_queue;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("India");
		stack.push("Germany");
		stack.push("America");
		
		System.out.println(stack);
		
		String poppedElement = stack.pop();
		System.out.println("popped element : "+poppedElement);

		System.out.println("Remaining element : "+stack);
		
		String peekElement = stack.peek();
		System.out.println("peek Element : "+peekElement);
		
		System.out.println("popped Element : "+stack.pop());
		System.out.println("peeked Element : "+stack.peek());
		
		System.out.println("now the stack look like : "+stack);
		
		
		
	}
}
