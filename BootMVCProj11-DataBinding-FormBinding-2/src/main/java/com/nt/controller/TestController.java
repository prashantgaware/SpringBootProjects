package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Student;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showStudentForm(@ModelAttribute("student") Student student) {
		student.setSno(1001);
		return "student_form";
	}
	
	@PostMapping("/register")
	public String registerStudent(@ModelAttribute("student") Student student) {
		System.out.println(student);
		
		return "show_result";
	}

}
