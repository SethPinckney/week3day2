package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingDemo {
	public static void main(String[] args) {
		
		// List<int> myNumbers = new ArrayList<int>(); // Lists and other Collections can only store Objects
		
		List<Integer> myNumbers = new ArrayList<Integer>();
		for(int ix = 0; ix < 10; ix++) {
			myNumbers.add(new Integer(ix));
		}
		
		for(Integer i : myNumbers) {
			System.out.println(i);
		}
		
		// Using autoboxing...
		System.out.println("Using autoboxing...");

		myNumbers.clear();
		
		for(int ix = 0; ix < 10; ix++) {
			myNumbers.add(ix);
		}
		
		for(Integer i : myNumbers) {
			System.out.println(i);
		}
		
		// autoboxing works for math too!
		
		Integer x = new Integer(2);
		int y = 4;
		
		int z = y / x;  // x is "unboxed" as an int before the expression is evaluated
		
		// null can cause problems for autoboxing
		x = null;
		// z = y / x; // this causes a runtime error because x is null when Java attempts to unbox it
	}
}
