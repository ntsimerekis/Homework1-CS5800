package com.tsimerekis.inheritance;

public class CommissionEmployee extends Employee {

	private int commissionRate;
	private int grossSales;
	
	public CommissionEmployee(String firstName, String lastName, String ssn, int commissionRate, int grossSales) {
		super(firstName, lastName, ssn);
		this.setCommissionRate(commissionRate);
		this.setGrossSales(grossSales);
	}

	public int getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(int commissionRate) {
		this.commissionRate = commissionRate;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Commission Rate: " + commissionRate + " Gross Sales: " + grossSales;
	}
}
