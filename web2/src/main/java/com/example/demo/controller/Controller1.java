package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controller1 {
	@RequestMapping("hi")
	public String demo()
	{
		return "home";
	}
	
	@RequestMapping("wel")
	public String Login()
	{
		return "welcome";
	}

}
