package com.mycompany.springdemo.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.springdemo.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		Employee employee=context.getBean("employee",Employee.class);
    		Address address=context.getBean("add",Address.class);
    		address.setAddress1("odisha");
    		address.setAddress2("India");
    		address.setPincode("000");
    		employee.setAddress(address);
    		System.out.println(employee);
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}