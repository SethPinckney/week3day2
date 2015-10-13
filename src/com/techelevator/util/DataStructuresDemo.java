package com.techelevator.util;

public class DataStructuresDemo {

	public static void main(String[] args) {
		
		System.out.println("The Queue data structure provides FIFO functionality");
		StringQueue myQueue = new StringQueue();
		myQueue.put("first");
		myQueue.put("second");
		myQueue.put("third");
		myQueue.put("fourth");
		
		while(myQueue.isEmpty() == false) {
			String s = myQueue.take();
			System.out.println(s);
		}
		
		System.out.println("The Stack data structure provides LIFO functionality");
		StringStack myStack = new ListStack();
		myStack.push("first");
		myStack.push("second");
		myStack.push("third");
		myStack.push("fourth");
		
		while(myStack.isEmpty() == false) {
			String s = myStack.pop();
			System.out.println(s);
		}
	}

}
