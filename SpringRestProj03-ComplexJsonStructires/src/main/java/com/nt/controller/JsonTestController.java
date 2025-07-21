package com.nt.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.SpringRestProj03ComplexJsonStructiresApplication;
import com.nt.dto.Company;
import com.nt.dto.Employee;

@RestController
@RequestMapping("/test")
public class JsonTestController {

    private final SpringRestProj03ComplexJsonStructiresApplication springRestProj03ComplexJsonStructiresApplication;

    JsonTestController(SpringRestProj03ComplexJsonStructiresApplication springRestProj03ComplexJsonStructiresApplication) {
        this.springRestProj03ComplexJsonStructiresApplication = springRestProj03ComplexJsonStructiresApplication;
    }
	
	@GetMapping("getCompany")
	public ResponseEntity<Company> get() {
		Company company = new Company("TCL", "Hyd", 20000, 50000000.00d, "IT");
		return new ResponseEntity<Company>(company, HttpStatus.OK);
	}

	@PostMapping("/createCompany")
	public ResponseEntity<Company> create(@RequestBody Company company) {
//		Company company = new Company("TCS", "Hyd", 200000, 500000000.00d, "IT");
		return new ResponseEntity<Company>(company, HttpStatus.CREATED);
	}
	
	@GetMapping("/getEmp")
	public ResponseEntity<Employee> getEmp() {
        Company company = new Company(
            "Innovatech Solutions",
            "Silicon Valley",
            500,
            150000000.50,
            "Technology"
        );

        List<Integer> mobileNumbers = Arrays.asList(1234567890, 3435432);

        Map<String, List<String>> identifications = new HashMap<>();
        identifications.put("primary", Arrays.asList("Passport", "Driver's License"));
        identifications.put("secondary", Arrays.asList("Employee ID Card"));

        LocalDateTime birthDate = LocalDateTime.parse("1990-05-15T08:30:00");

        // 5. Create the Employee object using the constructor
        Employee employee = new Employee(
            101L,
            "John Doe",
            company,
            mobileNumbers,
            identifications,
            birthDate
        );
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@PostMapping("/createEmp")
	public ResponseEntity<Employee> createEmp(@RequestBody Employee emp) {
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	
}
