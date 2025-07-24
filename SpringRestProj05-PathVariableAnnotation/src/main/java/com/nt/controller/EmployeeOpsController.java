package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;

@RestController
@RequestMapping("/emp/api")
public class EmployeeOpsController {

	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmployeeDetails(@PathVariable Long id) {
		System.out.println("EmployeeOpsController.getEmployeeDetails()");
		return new ResponseEntity<Employee>(
				new Employee(id, "Raja", "Hyd"), 
				HttpStatus.OK);
	}
	
}
