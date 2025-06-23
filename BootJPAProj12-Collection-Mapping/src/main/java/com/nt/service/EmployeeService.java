package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeInfo;
import com.nt.repo.IEmployeeRepo;

@Service("empService")
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepo employeeRepo;

	@Override
	public String registerEmployee(EmployeeInfo employeeInfo) {
		employeeRepo.save(employeeInfo);
		return "Employee registered successfully with ID: " + employeeInfo.getId();
	}

	@Override
	public List<EmployeeInfo> getAllEmployees() {
		return employeeRepo.findAll();
	}
}
