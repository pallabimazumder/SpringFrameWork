package com.nri.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.nri.entities.Employee;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		
		Employee empobj = null;
		System.out.println(empobj.toString());
		
		String myname = "Sunny";
		System.out.println(Integer.parseInt(myname));
		
		
		return new ModelAndView("home");
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String  nullPointerExHandler(Model model) {
		
		model.addAttribute("msg","Dear User Null Pointer Exception Has Occurred");
		return "nullerror";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String  numberFormatExHandler(Model model) {
		model.addAttribute("msg","Dear User Wrong Type Casting Occurred");
		return "nfeerror";
	}
	
}
