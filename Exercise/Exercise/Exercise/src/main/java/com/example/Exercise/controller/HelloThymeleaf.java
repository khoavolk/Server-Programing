package com.example.Exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloThymeleaf {
	@RequestMapping("/hello")
	public String Hello(@RequestParam(value="name")String name, @RequestParam(value="age")int age, Model model) {
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		return "hello";
	}


}