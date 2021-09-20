package com.xworkz.apartment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.apartment.dao.ApartmentDAO;
import com.xworkz.apartment.dao.ApartmentDAOImpl;
import com.xworkz.apartment.entity.ApartmentEntity;

public class ApartmentTester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApartmentDAO dao = context.getBean(ApartmentDAO.class);
		ApartmentEntity entity=new ApartmentEntity();
		entity.setLocation("Chickballapur");
		entity.setNoOfFloors(5);
		entity.setPrice(15000);
		entity.setLiftAvailable(true);
		dao.save(entity);
	}
}
