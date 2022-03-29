package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Cart;
import com.model.Product;

@RestController
public class CartController {
	/*@PostMapping("/addtocart")
	public String addtocart(@RequestBody List<Product> productlist) {
		Cart cart=new Cart();
		cart.setProductList(productlist);
		float sum=0;
		for(Product p:productlist)
		{
			sum+=p.getPrice();
		}
		cart.setTotalAmount(sum);
		cart.setStatus(true);
		return "cart confirmed";
	}*/
}
