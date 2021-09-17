package com.xworkz.fruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitTester {

	public static void main(String[] args) {


		ApplicationContext container=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 Fruit fruit=container.getBean(Fruit.class);
		 System.out.println(fruit.getName());
		 System.out.println(fruit.getColor());
		 System.out.println(fruit.getPrice());
		 System.out.println(fruit.isTaste());
		 fruit.energy();
		 System.out.println(fruit.getVitamin().getType());
		 System.out.println(fruit.getVitamin().isFatSoluble());
		 System.out.println(fruit.getVitamin().isWaterSoluble());
		 

	}

}
