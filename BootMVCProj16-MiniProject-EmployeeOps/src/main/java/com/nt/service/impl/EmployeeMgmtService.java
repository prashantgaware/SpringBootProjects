package com.nt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repo.IEmployeeRepo;
import com.nt.service.interfaces.IEmployeeMgmtService;

@Service("empMgmtService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeRepo employeeRepo;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public String registerEmployee(Employee employee) {
		long empId = employeeRepo.save(employee).getEmpNo();
		return "Employee registered with ID: " + empId;
	}

	@Override
	public String updateEmployee(Employee employee) {
		long empId = employeeRepo.save(employee).getEmpNo();
		return "Employee updated with ID: " + empId;
	}

	@Override
	public String deleteEmployee(Long empId) {
		if (employeeRepo.existsById(empId)) {
			employeeRepo.deleteById(empId);
			return "Employee deleted with ID: " + empId;
		} else {
			return "Employee not found with ID: " + empId;
		}
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		Optional<Employee> optional = employeeRepo.findById(empId);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

}
