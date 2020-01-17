package com.yash.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/abc")
public class HelloWorldController {

	@GetMapping
	public String hello(ModelMap map)
	{
		map.addAttribute("greeting", "Hello Spring");
		return "welcome";
	}
}
