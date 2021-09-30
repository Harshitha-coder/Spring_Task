package com.xworkz.vaccine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	public LoginController() {
		System.out.println("loginCOntroller bean created");
	}

	@RequestMapping(value = "/Login.do")
	public String onLoginButtonClicked(@RequestParam String email, @RequestParam String password, Model model) {
		if (email.equals("harshi@gmail.com") && password.equals("harshi")) {
			return "HomePage";
		} else {
			model.addAttribute("message", "email or password is incorrect");
			return "loginPage";
		}
	}
}
