package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.model.Student;

@Controller
public class MainController 
{
	@RequestMapping("/reg")
	public String loginCheck(@ModelAttribute("stu") Student s)
	{
		System.out.println(s.getRno());
		System.out.println(s.getName());
		return "success";
	}
}
