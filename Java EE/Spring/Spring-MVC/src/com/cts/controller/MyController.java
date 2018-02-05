package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("test.htm")
	public String test(Model data) {
		System.out.println("--- MyController test method got executed");
		data.addAttribute("userName", "Praveen Reddy");

		return "one";
	}

	@RequestMapping("abc/a1/a2")
	public void test1() {
		System.out.println("--- MyController test1 method got executed");
	}

	@RequestMapping("xyz")
	public ModelAndView test2() {
		System.out.println("--- MyController test2 method got executed");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display");
		mav.addObject("name", "Ozvitha");

		return mav;

	}

}
