package com.nt.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Student;

@Controller()
@RequestMapping("/data-binding")
public class TestController {
	
	@GetMapping("/getUser") 
	public String getUserForm(Map<String, Object> map) {
		Student student = new Student();
		student.setSno(1001);
		student.setSname("John Doe");
		student.setSadd("123 Main St");
		student.setAvg(85.5f);
		map.put("student", student);
		System.out.println("Returning user form with initial data: " + student);
		return "userForm";
	}
	
	@PostMapping("/registerUser")
	public ResponseEntity<String> registerStudent(@RequestBody Student student) {
		return ResponseEntity.ok("Student Details are :: " + student.getSno() + " " + 
				student.getSname() + " " + student.getSadd() + " " + student.getAvg());
	}

}
