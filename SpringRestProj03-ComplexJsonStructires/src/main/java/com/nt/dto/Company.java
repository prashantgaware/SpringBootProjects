package com.nt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Company {
	
	private String name;
	
	private String location;
	
	private Integer headCount;
	
	private Double turnOver;
	
	private String category;

}
