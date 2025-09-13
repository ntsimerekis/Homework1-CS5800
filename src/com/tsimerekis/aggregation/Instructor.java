package com.tsimerekis.aggregation;

public class Instructor {
	
	String firstName;
	String lastName;
	String officeNumber;
	
	public Instructor(String firstName, String lastName, String officeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeNumber = officeNumber;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + officeNumber;
	}

}
