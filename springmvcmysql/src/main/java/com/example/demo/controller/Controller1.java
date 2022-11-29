package com.example.demo.controller;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping("/demo12")
	public ModelAndView demo12(@RequestParam Integer id)
	{
		ModelAndView mv=new ModelAndView("show");
		stud s1=r1.findById(id).orElse(new stud());
		mv.addObject(s1);
		System.out.println(s1);	
		return mv;
			
	}

}
