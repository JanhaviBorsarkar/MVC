package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{
	@RequestMapping("/log")
	public String loginCheck(@RequestParam("username")String username, @RequestParam("password")String password)
	{
		System.out.println(username);
		System.out.println(password);
		return "success";
	}
}
