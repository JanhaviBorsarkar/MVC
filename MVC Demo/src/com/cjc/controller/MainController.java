package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController 
{
	@RequestMapping("/log")
	public String m1()
	{
		System.out.println("Login Successful!");
		return "success";
	}
	@RequestMapping("/")
	public String loginPage()
	{
		return "login";
	}
}
