package com.xworkz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HarshithaController {

	
	public HarshithaController() {
	System.out.println("controller created");
	}
	
	@RequestMapping(value="/Harshitha.com")
	public void onClicked()
	{
		System.out.println("invoked onClicked");
	}
	@RequestMapping(value="/Ranjitha.com")
	public void onClicked1()
	{
		System.out.println("invoked onClicked1");
	}
	@RequestMapping(value="/Navya.com")
	public void onClicked2()
	{
		System.out.println("invoked onClicked2");
	}
}
