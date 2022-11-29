
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cont {

	
	
	@RequestMapping("/top")
	public String Name()

	{
		return "hi";
	}
}
