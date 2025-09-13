package com.tsimerekis.polymorphism;

public class CruiseShip extends Ship {

	private int maxPassengers;
	
	public CruiseShip(String shipName, String yearBuilt, int maxPassengers) {
		super(shipName, yearBuilt);
		this.maxPassengers = maxPassengers;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Max Passengers: " + maxPassengers;
	}
	
	@Override
	public void print() {
		System.out.println(this);
	}
}
