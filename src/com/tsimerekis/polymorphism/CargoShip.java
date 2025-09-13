package com.tsimerekis.polymorphism;

public class CargoShip extends Ship{

	private int tonnage;
	
	public CargoShip(String shipName, String yearBuilt, int tonnage) {
		super(shipName, yearBuilt);
		this.setTonnage(tonnage);
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Tonnage: " + tonnage;
	}
	
	@Override
	public void print() {
		System.out.println(this);
	}
}
