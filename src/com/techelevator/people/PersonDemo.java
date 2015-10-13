package com.techelevator.people;

import java.util.Arrays;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person[] people = new Person[] { new Person("Seth", "Pinckney", 5), new Person("Jim", "Kasper", 4), new Person("Dan", "Wintrich", 3), new Person("Elizabeth", "Mis", 2), new Person("David", "Wintrich", 1)  };

		Arrays.sort(people);
		
		for(Person p : people) {
			System.out.println(p.getLastName() + ", " + p.getFirstName());
		}
	}

}
