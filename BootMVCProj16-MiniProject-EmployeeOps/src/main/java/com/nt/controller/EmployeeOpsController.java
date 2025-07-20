package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@GetMapping("/edit")
	public String showEditEmployeeForm(@RequestParam("empNo") Long empId, @ModelAttribute("employee") Employee employee) {
		Employee emp = empMgmtService.getEmployeeById(empId);
		BeanUtils.copyProperties(emp, employee);
		return "employee_edit";
	}
	
	@PostMapping("/edit")
	public String editEmployee(@ModelAttribute("employee") Employee employee, Map<String, List<Employee>> map) {
		String result = empMgmtService.editEmployee(employee);
		System.out.println(result);
		List<Employee> employeeList = empMgmtService.getAllEmployees();
		map.put("employeeData", employeeList);
		return "employee_report";
	}
	
	/**
	 * Delete an employee by empId
	 * @param empId The employee ID to delete
	 * @param map A map to hold the list of employees after deletion
	 * @return A view name to display the employee report
	 */
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("empNo") Long empId, Map<String, List<Employee>> map) {
		String result = empMgmtService.deleteEmployee(empId);
		System.out.println(result);
		List<Employee> employeeList = empMgmtService.getAllEmployees();
		map.put("employeeData", employeeList);
		return "employee_report";
	}
	
}
