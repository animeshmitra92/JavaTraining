package test;

public class WirelessCustomer extends Customer{
	
	public WirelessCustomer()
	{
		super();
		super.speed=0;
		super.downloadLimit=0;
		super.currentUsage=0;
		super.balanceLeft=0;
		super.plan='x';
	}
	public WirelessCustomer(int customerNumber, String customerName,char plan) {
		super(customerNumber, customerName);
		super.plan=plan;
		super.currentUsage=0;
		if(plan=='x')
		{
			super.speed=15;
			super.downloadLimit=50;
		}
		else if(plan=='y')
		{
			super.speed=20;
			super.downloadLimit=75;
		}
		else if(plan=='z')
		{
			super.speed=100;
			super.downloadLimit=200;
		}
		super.balanceLeft = super.downloadLimit-super.currentUsage;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		super.speed = speed;
	}
	public int getDownloadLimit() {
		return downloadLimit;
	}
	public void setDownloadLimit(int downloadLimit) {
		super.downloadLimit = downloadLimit;
	}
	public int getCurrentUsage() {
		return currentUsage;
	}
	public void setCurrentUsage(int currentUsage) {
		super.currentUsage = currentUsage;
	}
	public int getBalanceLeft() {
		return balanceLeft;
	}
	public void setBalance(int balanceLeft) {
		super.balanceLeft = balanceLeft;
	}
	public String getName()
	{
		return super.customerName;
	}
	public void customerDetails()
	{
		System.out.println("Name of Customer: "+this.getName()+" Speed: "+this.getSpeed()+" Mbps"+" Download Limit: "+this.getDownloadLimit()+" Gb"+" Current Usage: "+this.getCurrentUsage()+" Gb"+" Remaining Balance: "+this.getBalanceLeft()+" Gb");
	}

}
