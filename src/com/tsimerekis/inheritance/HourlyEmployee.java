package com.tsimerekis.inheritance;

public class HourlyEmployee extends Employee{
	
	private int wage;
	private int hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, String ssn, int wage, int hoursWorked) {
		super(firstName, lastName, ssn);
		this.setWage(wage);
		this.setHoursWorked(hoursWorked);
	}

	public float getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Wage: " + wage + "Hours Worked: " + hoursWorked;
	}

}
