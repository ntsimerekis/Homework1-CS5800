package com.tsimerekis.interfacee;

public class Freelancer implements Payable{
	
	private static final double OVERTIME_HOURS = 40.0;
	private static final double OVERTIME_MUL = 1.5;
	
	private String firstName;
	private String lastName;
	private double hourlyRate;
	private double hoursWorked = 0;
	
	public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public double calculatePayment() {
		if (hoursWorked <= OVERTIME_HOURS)
			return hoursWorked * hourlyRate;
		else
			return OVERTIME_HOURS * hourlyRate + ((hoursWorked - OVERTIME_HOURS) * hourlyRate * OVERTIME_MUL);
	}

	@Override
	public String getPayeeName() {
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

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public void setHours(double hours) {
		hoursWorked = hours;
	}
	
	/*
	 * I think these would be useful methods
	 */
	public void addHours(double hours) {
		hoursWorked += hours;
	}
	
	public void resetHours(double hours) {
		hoursWorked = 0;
	}
	
	public double getHours() {
		return hoursWorked;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " Calculated Payment: " + calculatePayment();
	}
	
	@Override
	public void print() {
		System.out.println(this);
	}
	
}
