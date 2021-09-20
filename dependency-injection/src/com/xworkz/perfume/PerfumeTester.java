package com.xworkz.perfume;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerfumeTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext1.xml");

		Perfume perfume = container.getBean(Perfume.class);
		System.out.println(perfume);
	}
}
