package com.tsimerekis.interfacee;

import java.util.ArrayList;

public class InterfaceDriver {

	public static void main(String[] args) {

		final var payables = new ArrayList<Payable>();
		payables.add(new Freelancer("Nicholas", "Tsimerekis", 30.0, 20));
		payables.add(new Freelancer("Dennis", "Ritchie", 100.0, 40));
		payables.add(new VendorInvoice("Sun Microsystems", "100100-3", 5000));
		payables.add(new VendorInvoice("Bell Labs", "130508-7", 20000));

		double totalPayout = 0;
		for (Payable p : payables) {
			p.print();
			totalPayout += p.calculatePayment();
		}
		
		System.out.println("Total Payout: " + totalPayout);
	}

}
