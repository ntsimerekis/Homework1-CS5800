package com.tsimerekis.inheritance;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	
	//SSN will be a string since no need for arithmetic
	private String ssn;
	
	public Employee(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + ssn;
	}
}
