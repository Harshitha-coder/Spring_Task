package com.xworkz.apartment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.apartment.dao.ApartmentDAO;
import com.xworkz.apartment.entity.ApartmentEntity;

@Component
public class ApartmentServiceImpl implements ApartmentService {

	@Autowired
	private ApartmentDAO apartmentDAO;

	@Override
	public boolean validateAndSave(ApartmentEntity entity) {
		boolean flag = false;

		if (entity != null) {
			System.out.println("entity is not null,can validate data");
			String location = entity.getLocation();
			if (location != null && !location.isEmpty()) {
				System.out.println("location is valid");
				flag = true;
			} else {
				System.out.println("location is invalid");
				flag = false;
			}
			Integer noOfFloors = entity.getNoOfFloors();
			if (noOfFloors > 5 && noOfFloors < 15) {
				System.out.println("noOfFloors is valid");
				flag = true;
			} else {
				System.out.println("noOfFloors is invalid");
				flag = false;
			}
			Boolean liftAvailable = entity.isLiftAvailable();
			if (liftAvailable != null) {
				System.out.println(" liftAvailable is valid");
				flag = true;
			} else {
				System.out.println(" liftAvailable is invalid");
				flag = false;
			}
			Double price = entity.getPrice();
			if (price > 5000 && price < 15000) {
				System.out.println("price is valid");
				flag = true;
			} else {
				System.out.println("price is invalid");
				flag = false;
			}

			this.apartmentDAO.save(entity);
			System.out.println("data is valid,returning success");
			flag = true;
			return flag;

		}

		return flag;
	}
}
