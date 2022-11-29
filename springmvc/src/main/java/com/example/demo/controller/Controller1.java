package com.example.demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.stud;
import com.example.demo.rpo.studdao;
@Controller
public class Controller1 {
	
	@Autowired
	studdao r1;
	@RequestMapping("/")
	public String demo()
	{
		return "home";
		
	}
	@RequestMapping("/add")
	public String demo1(stud s1)
	{
		r1.save(s1);
		return "home";
		
	}

}
