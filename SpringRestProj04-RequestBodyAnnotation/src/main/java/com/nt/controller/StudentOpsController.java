package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentOpsController {

	@PostMapping("/register-json")
	public ResponseEntity<Student> registerStudentJson(@RequestBody Student student) {
		System.out.println("StudentOpsController.registerStudent()");
		System.out.println("Student Details: " + student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@PostMapping("/register-xml")
	public ResponseEntity<Student> registerStudentXml(@RequestBody Student student) {
		System.out.println("StudentOpsController.registerStudentXml()");
		System.out.println("Student details: " + student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
}
