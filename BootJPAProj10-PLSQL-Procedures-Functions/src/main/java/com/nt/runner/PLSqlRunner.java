package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;

@Component
public class PLSqlRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService empService;
	
	@Override
	public void run(String... args) throws Exception {
		empService.fetchEmployeesByDesg("CLERK", "MANAGER").forEach(emp -> {
			System.out.println(emp);
		});
		
	}

	
}
