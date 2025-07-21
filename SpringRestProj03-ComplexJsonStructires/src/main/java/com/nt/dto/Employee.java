package com.nt.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Employee {
	
	private Long id;
	
	private String name;
	
	private Company company;
	
	private List<Integer> mobileNums;
	
	private Map<String, List<String>> identifications;

	private LocalDateTime birthDate;
}
