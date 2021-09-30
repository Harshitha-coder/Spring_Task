package com.xworkz.vaccine.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.vaccine.dao.RegisterDAO;
import com.xworkz.vaccine.dto.RegisterDTO;
import com.xworkz.vaccine.entity.RegisterEntity;

@Service
public class RegisterServiceImpl implements RegisterService {

	private RegisterDAO registerDAO;

	@Autowired
	public RegisterServiceImpl(RegisterDAO registerDAO) {
		super();
		this.registerDAO = registerDAO;
	}

	@Override
	public boolean validateSaveRegisterDTO(RegisterDTO registerDTO) {
		boolean flag = false;
		if (registerDTO != null) {
			System.out.println("dto is not null,can validate data");

			if (registerDTO.getUserName() != null && !registerDTO.getUserName().isEmpty()) {
				flag = true;
			}
			if (registerDTO.getEmail() != null && !registerDTO.getEmail().isEmpty()) {
				flag = true;
			}
			if (registerDTO.getPassword() != null && !registerDTO.getPassword().isEmpty()) {
				flag = true;
			}
			if (registerDTO.getVaccineType() != null && !registerDTO.getVaccineType().isEmpty()) {
				flag = true;
			}
			if (registerDTO.getGender() != null && !registerDTO.getGender().isEmpty()) {
				flag = true;
			}
			if (flag) {
				RegisterEntity registerEntity = new RegisterEntity();
				BeanUtils.copyProperties(registerDTO, registerEntity);
				this.registerDAO.saveRegisterEntity(registerEntity);
				return flag;
			}
		}
		return flag;
	}

}
