package com.xworkz.apartment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.apartment.dao.ApartmentDAO;
import com.xworkz.apartment.dao.ApartmentDAOImpl;
import com.xworkz.apartment.entity.ApartmentEntity;
import com.xworkz.apartment.service.ApartmentService;

public class ApartmentTester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApartmentService service = context.getBean(ApartmentService.class);
		ApartmentEntity entity = new ApartmentEntity();
		entity.setLocation("Banglore");
		entity.setNoOfFloors(13);
		entity.setPrice(14000);
		entity.setLiftAvailable(true);
		service.validateAndSave(entity);
	}
}
