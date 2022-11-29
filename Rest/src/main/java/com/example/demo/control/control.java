package com.example.demo.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
	@RequestMapping("top")
	public String web()
	{
		return "home";
	}

}
