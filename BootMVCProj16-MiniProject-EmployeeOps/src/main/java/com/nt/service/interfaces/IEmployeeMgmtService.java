package com.nt.service.interfaces;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService {
	
	List<Employee> getAllEmployees();
	
	String registerEmployee(Employee employee);
	
	Employee getEmployeeById(Long empId);
	
	String updateEmployee(Employee employee);
	
	String deleteEmployee(Long empId);

}
