package test;

public class Enquiry {
	
	int enquiryNumber;
	String enquiryType;
	int customerID;
	String description;
	static int count=0;
	public Enquiry()
	{
		
	}
	
	Enquiry(String enquiryType,int customerID, String description )
	{
		count++;
		this.enquiryNumber=count;
		this.enquiryType=enquiryType;
		this.customerID=customerID;
		this.description=description;
	}

}
