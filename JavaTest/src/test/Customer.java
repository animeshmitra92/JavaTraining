package test;

abstract class Customer {
	
	int customerNumber;
	String customerName;
	int speed;
	int downloadLimit;
	int currentUsage;
	int balanceLeft;
	char plan;
	abstract void customerDetails();
	Customer()
	{
		customerNumber=0;
		customerName=null;
		
	}
	Customer(int customerNumber, String customerName )
	{
		this.customerNumber=customerNumber;
		this.customerName=customerName;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
