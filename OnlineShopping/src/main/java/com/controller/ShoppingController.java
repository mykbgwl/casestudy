package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {
	@GetMapping("/home")
	public String getHome() {
		return "Home";
	}
	
}
