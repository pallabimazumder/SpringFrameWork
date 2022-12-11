package com.nri.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	
	//localhost/I_SpringWebMVC/
	//methods of controllers are called handlers
	// Handlers
	@RequestMapping(value="/")
	public String getHome() {
		
		//as soon as we return index it will go to the views folder and search for index
		return "index";
	}
	
	//Model vs ModelAndView
	 @RequestMapping(value="/about")
	 public String getAbout(Model model) {
	  
	 //attribute with key value pair to use in about.jsp page model = new Model();
	 model.addAttribute("cname", "nrifintech"); 
	 return "about"; 
	 }
	 
	 
	@RequestMapping(value="/feedback")
	public ModelAndView getFeed() {
		
		System.out.println("Sending data from controller to view using ModelAndView");
		ModelAndView mview = new ModelAndView();
		mview.addObject("myname","sovan");	//Instead of add attribute
		mview.setViewName("feedback");		//To specify the view name
		
		List<String> friends = new ArrayList();
		friends.add("Rahul");
		friends.add("Mini");
		friends.add("Corona");
		
		mview.addObject("friends",friends);
		
		return mview;
	}
	
	@RequestMapping(value="/testone")
	public RedirectView getTestOne() {
	  
	 RedirectView rview = new RedirectView();
	 rview.setUrl("https://google.com");
	 
	 return rview; 
	 }
	
	@RequestMapping(value="/testwo")
	public String getTestTwo() {
	  
	 return "redirect:feedback"; 
	 }
	
	@RequestMapping(value="/process/{empid}/{empname}")
	public String getProcess(@PathVariable("empid") int eid,@PathVariable("empname") String ename,Model model) {

	model.addAttribute("empid",eid);
	model.addAttribute("empame",ename);
	System.out.println(eid+" "+ename);
	 return "about"; 
	 }
	
	@ResponseBody		//Just A String msg not a View
	@RequestMapping(value="/msg")
	public String showMsg() {
		return "Welcome to Spring web MVC";
	}
}
