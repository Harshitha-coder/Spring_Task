package com.xworkz.airport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirportTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("aplicationContext.xml");
		Airport airport = container.getBean(Airport.class);
		airport.runWay();
		airport.maintenance();
		System.out.println(airport);
		String string = (String)container.getBean("string");
		System.out.println(string);
		Double db=(Double)container.getBean("double");
		System.out.println(db);
		Integer integer=(Integer)container.getBean("integer");
		System.out.println(integer);
		Boolean temp=(Boolean)container.getBean("boolean");
		System.out.println(temp);
		Long value=(Long)container.getBean("long");
		System.out.println(value);
		Short sht=(Short)container.getBean("short");
		System.out.println(sht);
		Byte byt=(Byte)container.getBean("byte");
		System.out.println(byt);
		Float flt=(Float)container.getBean("float");
		System.out.println(flt);
		
	}
}
