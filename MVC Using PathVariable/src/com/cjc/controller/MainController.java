package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController 
{
	@RequestMapping("/log/{username}/{password}")
	public String loginCheck(@PathVariable("username")String username, @PathVariable("password")String password)
	{
		System.out.println(username);
		System.out.println(password);
		return "success";
	}
}
