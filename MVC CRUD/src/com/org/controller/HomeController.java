package com.org.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import com.org.model.Student;
import com.org.service.HomeService;

@Controller
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String firstPage() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String preRegister() {
		return "register";
	}
	
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute("stu") Student s) {
		int id=hs.saveData(s);
		if(id>0) {
			return "login";
		}
		else {
			
			return "register";
		}
		
	}
	@RequestMapping("/log")
	public String loginCheck(@RequestParam("uname") String uname,@RequestParam("pass") String pass,Model m) {
		List<Student> slist=hs.loginCheck(uname,pass);
		m.addAttribute("data", slist);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editRecord(@RequestParam("id") int id,Model m) {
	  Student stu=hs.editRecord(id);
		m.addAttribute("s", stu);
		return "update";
	}
	
	@RequestMapping("/update")
	public String updateRecord(@ModelAttribute("stu") Student s,Model m) {
		List<Student> slist=hs.updateRecord(s);
		m.addAttribute("data", slist);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String deleteRecord(@RequestParam("id") int id,Model m) {
		List<Student> slist=hs.deleteRecord(id);
		m.addAttribute("data", slist);
		return "success";
	}
	
	@RequestMapping("/add")
	public String addRecord() {
		return "register";
	}
	
	@RequestMapping("*")
	public String errorPage() {
		return "error";
	}
}
