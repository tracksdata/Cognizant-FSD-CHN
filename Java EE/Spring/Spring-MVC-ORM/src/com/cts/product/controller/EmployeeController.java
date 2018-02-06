package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.product.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("emp")
	public void f1() {
		System.out.println("--- EmployeeController f1 method");
	}
	
	@RequestMapping("loadEmpForm")
	public String loadEmpRegForm(Model model,@ModelAttribute("empCmd") Employee emp) {
		// set default data to emp
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(934739);
		
		List<String> cities=new ArrayList<>();
		
		cities.add("Hyderabad");
		cities.add("Goa");
		cities.add("Pune");
		cities.add("Chennai");
		cities.add("Bangalore");
		
		model.addAttribute("myCities", cities);
		model.addAttribute("employee", emp);
		
		return "form";
	}
	
	
	@RequestMapping("saveEmp")
	public String saveEmployee(@ModelAttribute Employee emp,Model model) {
		
		model.addAttribute("employee", emp);
		
		
		return "empdata";
	}
	
	
}
