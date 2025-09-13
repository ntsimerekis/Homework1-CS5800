package com.tsimerekis.interfacee;

public class VendorInvoice implements Payable {

	private String vendorName;
	private String invoiceNumber;
	private double amountDue;
	
	public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
		this.setVendorName(vendorName);
		this.setInvoiceNumber(invoiceNumber);
		this.setAmountDue(amountDue);
	}
	
	@Override
	public double calculatePayment() {
		return amountDue;
	}

	@Override
	public String getPayeeName() {
		return vendorName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		if (amountDue < 0)
			throw new IllegalArgumentException();
		this.amountDue = amountDue;
	}
	
	@Override
	public String toString() {
		return vendorName + " " + invoiceNumber + " " + "Amount Due: " + amountDue;
	}
	
	@Override
	public void print() {
		System.out.println(this);
	}

}
