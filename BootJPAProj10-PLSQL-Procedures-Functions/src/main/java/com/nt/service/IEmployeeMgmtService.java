package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService {
	
	List<Employee> fetchEmployeesByDesg(String desg1, String desg2);

}
