package com.xworkz.demo.controller;


import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class HarshithaController {

	public HarshithaController() {
		System.out.println("controller created");
	}

	@RequestMapping(value = "/Harshitha.com")
	public String onClicked(@RequestParam String actorName, @RequestParam String actressName,
			@RequestParam String movieName, @RequestParam String directorName,Model model) {
		System.out.println("invoked onClicked");
		System.out.println("actor name is:" + actorName);
		System.out.println("actress name is:" + actressName);
		System.out.println("movie name is:" + movieName);
		System.out.println("director name is:" + directorName);
		
		model.addAttribute("actorName", actorName);
		model.addAttribute("actressName", actressName);
		model.addAttribute("movieName", movieName);
		model.addAttribute("directorName", directorName);
		
		return "webresponse";
		
	}

	@RequestMapping(value = "/Ranjitha.com")
	public void onClicked1() {
		System.out.println("invoked onClicked1");
	}

	@RequestMapping(value = "/Navya.com")
	public void onClicked2() {
		System.out.println("invoked onClicked2");
	}
	
	@RequestMapping(value="/getName.com")
	public String getName() {
		System.out.println("invoked getName");
		return "webresponse";
	}
}
