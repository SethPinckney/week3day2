package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Jim");
		names.add("Elizabeth");
		names.add("Dan");
		names.add("Seth");
		names.add("Christo");
		names.add("Bruce");
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		//the elements will be returned in the same order they were added
		for(String n : names) {
			System.out.println(n);
		}
		
		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Jim");
		
		for(String n : names) {
			System.out.println(n);
		}
		
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(2, "David");
		
		for(String n : names) {
			System.out.println(n);
		}
		
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		names.remove(2);
		
		for(String n : names) {
			System.out.println(n);
		}
	}
}
