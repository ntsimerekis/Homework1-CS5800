package com.tsimerekis.inheritance;

public class BaseEmployee extends Employee {
	
	private int baseSalary;

	public BaseEmployee(String firstName, String lastName, String ssn, int baseSalary) {
		super(firstName, lastName, ssn);
		this.setBaseSalary(baseSalary);
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Base Salary: " + baseSalary;
	}
}
