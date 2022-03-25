package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String getIndex()
	{
		return "index";
	}
	@RequestMapping("/register")
	public ModelAndView addItemForm()
	{
		ModelAndView modelView=new ModelAndView("register");
		return modelView;
	}
	
	@ModelAttribute("users")
	public User getItem() {
		User user=new User();
		user.setUsername("mayank");
		user.setEmail("mayank123@gmail.com");
		user.setPassword("mayank123");
		user.setShipping_address("Delhi");
		user.setBilling_address("Delhi");
		return user;
	}
	
	@RequestMapping(value="/saveuser", method=RequestMethod.POST)
	public ModelAndView saveuser(@ModelAttribute("users")User user)
	{
		ModelAndView modelView=new ModelAndView("successUser");
		modelView.addObject("user",user);
		
		return modelView;
	}
}
