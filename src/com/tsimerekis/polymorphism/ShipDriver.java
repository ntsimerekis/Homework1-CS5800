package com.tsimerekis.polymorphism;

public class ShipDriver {

	public static void main(String[] args) {
		var ships = new Ship[3];
		ships[0] = new Ship("RMS Queen Mary", "1936");
		ships[1] = new CruiseShip("MS Koningsdam", "2012", 30000);
		ships[2] = new CargoShip("Cosco Ship", "1990", 50000);
	
		for (Ship s : ships)
			s.print();
	}
}
