package com.springboot.Introduction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Hellorequest {
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="location") String location, @RequestParam(name="name") String Name ) {
		return "Welcome to the " + location + " & " + Name;
	}

}
