package com.crudDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("msg", "Spring 3 MVC Hello World");
		return "hello";
	}
}
