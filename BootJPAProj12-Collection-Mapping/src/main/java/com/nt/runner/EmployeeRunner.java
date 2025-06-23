package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.EmployeeInfo;
import com.nt.service.IEmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService empService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("==================BootJPAProj12-Collection-Mapping===================");
		
		try {
			System.out.println("**********Registering Employees**********");
			EmployeeInfo employeeInfo1 = new EmployeeInfo();
            employeeInfo1.setEName("John Down");
            employeeInfo1.setFriends(List.of("Alice", "Bob", "Charlie")); 
            employeeInfo1.setPhoneNumber(Set.of(9999999999L, 8888888888L));
            employeeInfo1.setIdDetails(Map.of("aadhar", "1234-5678-9012", "pan", "ABCDE1234F"));
			System.out.println(empService.registerEmployee(employeeInfo1));
			
			EmployeeInfo employeeInfo2 = new EmployeeInfo();
			employeeInfo2.setEName("Jane Smith");
			employeeInfo2.setFriends(List.of("David", "Eve"));
			employeeInfo2.setPhoneNumber(Set.of(7777777777L, 6666666666L));
			employeeInfo2.setIdDetails(Map.of("aadhar", "2345-6789-0123", "pan", "FGHIJ5678K"));
			System.out.println(empService.registerEmployee(employeeInfo2));
			
			EmployeeInfo employeeInfo3 = new EmployeeInfo();
			employeeInfo3.setEName("Alice Johnson");
			employeeInfo3.setFriends(List.of("Frank", "Grace"));
			employeeInfo3.setPhoneNumber(Set.of(5555555555L, 4444444444L));
			employeeInfo3.setIdDetails(Map.of("aadhar", "3456-7890-1234", "pan", "KLMNO6789L"));
			System.out.println(empService.registerEmployee(employeeInfo3));
			
			System.out.println("Getting all employees:");
			List<EmployeeInfo> employees = empService.getAllEmployees();
			employees.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
