package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController 
{
	@RequestMapping("/reg")
	public String loginCheck(@RequestParam("uname")String uname, @RequestParam("pass")String pass, Model m, ModelMap m1)
	{
		System.out.println(uname);
		System.out.println(pass);
		m.addAttribute("data", uname).addAttribute("data1", pass); //it is for model interface
		m1.addAttribute("uname", uname).addAttribute("pass", pass); //it is for modelMap
		return "success";
	}
}
