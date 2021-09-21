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
		boolean validateLocation = false;
		boolean validateNoOfFloors = false;
		boolean validateLiftAvailable = false;
		boolean validatePrice = false;
		if (entity != null) {
			System.out.println("entity is not null,can validate data");
			String location = entity.getLocation();
			if (location != null && !location.isEmpty()) {
				System.out.println("location is valid");
				validateLocation = true;
			} else {
				System.out.println("location is invalid");
				validateLocation = false;
			}
			Integer noOfFloors = entity.getNoOfFloors();
			if (noOfFloors > 5 && noOfFloors < 15) {
				System.out.println("noOfFloors is valid");
				validateNoOfFloors = true;
			} else {
				System.out.println("noOfFloors is invalid");
				validateNoOfFloors = false;
			}
			Boolean liftAvailable = entity.isLiftAvailable();
			if (liftAvailable != null) {
				System.out.println(" liftAvailable is valid");
				validateLiftAvailable = true;
			} else {
				System.out.println(" liftAvailable is invalid");
				validateLiftAvailable = false;
			}
			Double price = entity.getPrice();
			if (price > 5000 && price < 15000) {
				System.out.println("price is valid");
				validatePrice = true;
			} else {
				System.out.println("price is invalid");
				validatePrice = false;
			}
			if (validateLocation && validateNoOfFloors && validatePrice && validateLiftAvailable) {
				this.apartmentDAO.save(entity);
				System.out.println("data is valid,returning success");
				return true;
			}
		}

		return false;
	}
}
