package com.techelevator.people;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}

	public int compareTo(Person otherPerson) {
		if(this.age > otherPerson.age) {
			return 1;
		} else if(this.age < otherPerson.age) {
			return -1;
		} else {
			return 0;
		}
	}
}
