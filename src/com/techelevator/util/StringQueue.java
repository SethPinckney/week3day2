package com.techelevator.util;

import java.util.ArrayList;
import java.util.List;

public class StringQueue {
	private List<String> queueItems = new ArrayList<String>();
	
	public String take() {
		String result = queueItems.get(0);
		queueItems.remove(0);
		return result;
	}
	
	public void put(String newItem) {
		queueItems.add(newItem);
	}
	
	public boolean isEmpty() {
		return queueItems.isEmpty();
	}
}
