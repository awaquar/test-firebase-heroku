package com.hussain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hussain.model.Intern;
import com.hussain.service.InternService;

@Controller
public class InternController {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	
	@RequestMapping("save")
	public String saveIntern(Intern intern) {
		InternService.saveIntern(intern);
		return "home.jsp";
	}
}
