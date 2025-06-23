package com.nt.service;

import java.util.List;

import com.nt.entity.EmployeeInfo;

public interface IEmployeeService {
	
	String registerEmployee(EmployeeInfo employeeInfo);
	
	List<EmployeeInfo> getAllEmployees();

}
