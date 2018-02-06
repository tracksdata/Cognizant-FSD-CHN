package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.product.model.Product;

@Controller
public class ProductController {
	@RequestMapping("test")
	public void test() {
		System.out.println("----- ProductController test method");
	}
	
	@RequestMapping("disp")
	public String test1(Model m) {
		System.out.println("----- ProductController test method");
		m.addAttribute("name", "James Goedic");
		return "display";
	}
	
	
	@RequestMapping("saveProduct")
	public String saveProduct(Model model,@RequestParam("prodId") int prodId,@RequestParam("prodName")String prodName,@RequestParam("price")double price) {
		
		Product prod=new Product();
		
		prod.setProdId(prodId);
		prod.setProdName(prodName);
		prod.setPrice(price);
		
		model.addAttribute("product", prod);
		
		
		
		return "display";
	}
	
	
	@RequestMapping("saveProduct_v1")
	public String saveProduct_v1(Model model,@ModelAttribute("cmdName")Product prod) {
		
		
		model.addAttribute("product", prod);
		
		return "display_v1";
	}
	
	
	
	
	
	
	
	
	
	
	
}
