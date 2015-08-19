package test;

public class CustomerMain {
	public static void main(String args[])
	{
		Customer customer1=new DatacardCustomer(1,"Animesh",'z');
		Customer customer2=new WirelessCustomer(2,"Sudeep",'x');
		customer1.customerDetails();
		customer2.customerDetails();	
		
	}

}
