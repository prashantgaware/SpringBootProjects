package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service("empService")
public class EmployeeManagerService implements IEmployeeMgmtService {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> fetchEmployeesByDesg(String desg1, String desg2) {
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("GET_EMP_BY_JOB", Employee.class);
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		
		query.setParameter(1, desg1);
		query.setParameter(2, desg2);
		
		List<Employee> emps = query.getResultList();
		return emps;
	}
	
	
	
}
