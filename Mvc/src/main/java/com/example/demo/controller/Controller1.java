package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import reactor.netty.http.server.HttpServerRequest;


@Controller
public class Controller1 {
	@RequestMapping("hi")
	public String demo(HttpServletRequest req)
	{
		HttpSession ses=req.getSession();
	    String name=req.getParameter("name");
	    System.out.println("hi "+name);
	    ses.setAttribute("name", name);
		return "home";
	}

}
