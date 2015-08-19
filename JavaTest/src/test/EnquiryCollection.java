package test;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class EnquiryCollection extends Enquiry{
	public static void main(String args[])
	{
		Enquiry enquiry1=new Enquiry("Datacard", 1, "Pricing");
		Enquiry enquiry2=new Enquiry("Wireless",2,"Plan Type");
		List<Enquiry> enquiryList=new ArrayList<Enquiry>();
   	    enquiryList.add(enquiry1);
   	    enquiryList.add(enquiry2);
   	    Iterator<Enquiry> i= enquiryList.iterator();
   	    while(i.hasNext())
   	    {
   	    	Enquiry iteratorEnquiry= new Enquiry();
   	    	iteratorEnquiry=i.next();
   	    	System.out.println("Customer ID: "+iteratorEnquiry.customerID+" Enquiry Type: "+iteratorEnquiry.enquiryType+" Description: "+iteratorEnquiry.description);
   	    	System.out.println();
   	    	System.out.println();
   	    }
    }

}
