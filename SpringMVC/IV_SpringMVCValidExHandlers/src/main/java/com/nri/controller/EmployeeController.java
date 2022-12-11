package com.nri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping(value="/msg")
	public String display(Model model) {
		model.addAttribute("empobj",new Employee());
		return "viewpage";
	}
	
	@RequestMapping(value="/msgagain")
	public String subForm(@Validated @ModelAttribute("empobj") Employee empobj, BindingResult br) {
		if(br.hasErrors()) {
			return "viewpage";
		}
		else {
			return "success";
		}
	}
}
