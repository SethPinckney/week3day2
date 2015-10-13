package com.techelevator.util;

import java.util.ArrayList;
import java.util.List;

public class ListStack implements StringStack {

	private List<String> stackItems;
	
	public ListStack() {
		stackItems = new ArrayList<String>();
	}
	
	public String pop() {
		String result = stackItems.get(stackItems.size() - 1);
		stackItems.remove(stackItems.size() - 1);
		return result;
	}

	public void push(String newItem) {
		stackItems.add(newItem);
	}

	public boolean isEmpty() {
		return stackItems.isEmpty();
	}

}
