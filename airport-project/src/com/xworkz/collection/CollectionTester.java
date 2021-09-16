package com.xworkz.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Collection collection=container.getBean(Collection.class);

	}

}
