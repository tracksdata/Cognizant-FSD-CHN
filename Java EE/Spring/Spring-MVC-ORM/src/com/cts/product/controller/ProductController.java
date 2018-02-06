package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.product.entity.ProductEntity;
import com.cts.product.model.Product;
import com.cts.product.service.SaveProductService;

@Controller
public class ProductController {

	@Autowired
	private SaveProductService saveService;
	
	@RequestMapping("saveProduct")
	public String saveProduct_v1(Model model, @ModelAttribute("cmdName") ProductEntity prod) {

		saveService.saveProduct(prod);
		// model.addAttribute("product", prod);

		return "info";
	}
	
	@RequestMapping("listProds")
	public String listAll(Model model) {
		
		
		List<ProductEntity> prods=saveService.listProds();
		model.addAttribute("products", prods);
		
		
		return "displayproducts";
	}
	
	
	

}
