package com.door.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Welcome {
	
		
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcomePage() {
		System.out.println("/hello");
		return "index";
	}

}