package com.serviceprovider;

import javax.xml.ws.Endpoint;

import com.services.Calculator;

public class CalculatorServiceProvider {
	public static void main(String args[])
	{
		Calculator calc=new Calculator();
		String url="http://192.168.0.152:1100/calculator";
		Endpoint.publish(url, calc);
		System.out.println("Service started");
	}

}
