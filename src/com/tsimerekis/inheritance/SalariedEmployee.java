package com.tsimerekis.inheritance;

public class SalariedEmployee extends Employee {

	private int weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String ssn, int weeklySalary) {
		super(firstName, lastName, ssn);
		this.setWeeklySalary(weeklySalary);
	}

	public float getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(int weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Weekly Salary: " + weeklySalary;
	}
}
