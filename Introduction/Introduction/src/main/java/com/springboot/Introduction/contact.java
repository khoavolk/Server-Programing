package com.springboot.Introduction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class contact {
	@RequestMapping("/contact")
	public String con() {
		return "This is the contact page";
	}
}
