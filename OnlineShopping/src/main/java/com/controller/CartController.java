package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Cart;
import com.model.CartService;
import com.model.Product;

@RestController
public class CartController {
	
	@Autowired
	CartService service;
	
	@PostMapping("/addtocart/{email}")
	public String addtocart(@RequestBody List<Product> productlist,@PathVariable("email") String email) {
		Cart cart=new Cart();
		cart.setProductlist(productlist);
		float sum=0;
		for(Product p:productlist)
		{
			sum+=p.getPrice();
		}
		cart.setTotalAmount(sum);
		cart.setStatus(true);
		User user= service.findUser(email);
		service.addCart(cart);
		return "cart confirmed";
	}
	
	
}
