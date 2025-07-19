package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Employee;
import com.nt.service.interfaces.IEmployeeMgmtService;

@Controller
public class EmployeeOpsController {
	
	@Autowired
	private IEmployeeMgmtService empMgmtService;

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/report")
	public String showEmployeeReport(Map<String, List<Employee>> map) {
		List<Employee> employeeList = empMgmtService.getAllEmployees();
		map.put("employeeData", employeeList);
		return "employee_report";
	}
	
	@GetMapping("/add")
	public String showEmployeeRegistrationForm(@ModelAttribute("employee") Employee employee) {
		employee.setDesignation("Developer");
		return "employee_register";
	}
	
	@PostMapping("/add")
	public String registerEmployee(@ModelAttribute("employee") Employee employee, Map<String, List<Employee>> map) {
		String result = empMgmtService.registerEmployee(employee);
		System.out.println(result);
		List<Employee> employeeList = empMgmtService.getAllEmployees();
		map.put("employeeData", employeeList);
		return "employee_report";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam Long empId, Map<String, List<Employee>> map) {
		String result = empMgmtService.deleteEmployee(empId);
		System.out.println(result);
		List<Employee> employeeList = empMgmtService.getAllEmployees();
		map.put("employeeData", employeeList);
		return "employee_report";
	}
	
}
