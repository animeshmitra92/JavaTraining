package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class EmpController {
	public static void main(String args[])
	{
		ApplicationContext bean= new ClassPathXmlApplicationContext("employeebean.xml");
		Employee employee= (Employee) bean.getBean("emp1");
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
	}
	

}
