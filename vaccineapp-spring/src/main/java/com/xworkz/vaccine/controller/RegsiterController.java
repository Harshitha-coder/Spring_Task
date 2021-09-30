package com.xworkz.vaccine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.vaccine.dto.RegisterDTO;
import com.xworkz.vaccine.service.RegisterService;

@Controller
public class RegsiterController {

	private RegisterService registerService;

	@Autowired
	public RegsiterController(RegisterService registerService) {
		super();
		this.registerService = registerService;
	}

	@RequestMapping(value = "/register.do")
	public String onRegisterButton(@ModelAttribute RegisterDTO registerDTO, Model model) {
		System.out.println("invoked onRegisterButton()");

		boolean result = this.registerService.validateSaveRegisterDTO(registerDTO);
		if (result) {
			System.out.println("data is saved");
			model.addAttribute("message", "Registration successfull");
			return "loginPage";
		} else {
			System.out.println("data is not saved");
			model.addAttribute("message", "Registration is not successfull");
			return "index";
		}
	}

}
