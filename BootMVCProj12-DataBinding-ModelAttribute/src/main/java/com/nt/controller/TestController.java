package com.nt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Student;

@Controller
@RequestMapping("/test")
public class TestController {

	@PostMapping("/save")
	public ResponseEntity<String> saveStudentDetails(@RequestBody Student student) {
		System.out.println("TestController.saveStudentDetails()");
		System.out.println(student.getSno());
		System.out.println("Student Details: " + student);
		return ResponseEntity.ok("Student details saved successfully:"
				+ " [Sno: " + student.getSno() + ", Name: " + student.getSname() 
				+ ", Address: " + student.getSadd() + ", Email: " + student.getEmail() + "]");
	}
	
	/*@PostMapping("/save")
	public ResponseEntity<String> saveStudentDetails(@ModelAttribute Student student) {
		System.out.println("TestController.saveStudentDetails()");
		System.out.println(student.getSno());
		System.out.println("Student Details: " + student);
		return ResponseEntity.ok("Student details saved successfully:"
				+ " [Sno: " + student.getSno() + ", Name: " + student.getSname() 
				+ ", Address: " + student.getSadd() + ", Email: " + student.getEmail() + "]");
	}*/
}
