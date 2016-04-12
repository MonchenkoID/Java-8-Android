package com.github.monchenkoid.java_eight.model;

/**
 * Based on https://medium.com/@jplanes/lambda-validations-with-java-8-86aa8143bd9f#.6zlo8eshj
 */

public class Person {
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	
	public Person(String firstName, String lastName, String email, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

}
