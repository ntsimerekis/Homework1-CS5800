package com.tsimerekis.polymorphism;

public class Ship {

	private String shipName;
	private String yearBuilt;
	
	public Ship(String shipName, String yearBuilt) {
		this.setShipName(shipName);
		this.setYearBuilt(yearBuilt);
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	@Override
	public String toString() {
		return shipName + " " + yearBuilt;
	}
	
	public void print() {
		System.out.println(this);
	}
}
