package com.example.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.prodapt;
import com.example.demo.services.demo;

@ControllerAdvice
public class control {
	
	@Autowired
	private demo d1;
	
	
	@PostMapping("/add")
	public prodapt addprod(@RequestBody prodapt p3)
	{
		return d1.saveitem(p3);
		
	}
	@PostMapping("/addp")
	public List<prodapt> addprod(@RequestBody List<prodapt> p3)
	{
		return d1.listitem(p3);
		
	}

}
