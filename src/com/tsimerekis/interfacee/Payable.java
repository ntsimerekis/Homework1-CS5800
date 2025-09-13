package com.tsimerekis.interfacee;

public interface Payable {

	double calculatePayment();
	String getPayeeName();
	
	//This must be implemented for instructions to make sense
	void print();
}
