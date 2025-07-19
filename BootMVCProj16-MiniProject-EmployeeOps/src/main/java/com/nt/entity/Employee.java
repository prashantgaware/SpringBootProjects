package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_emp_ops")
public class Employee implements Serializable {

	@Id
	@SequenceGenerator(name = "empId_seq_gen", sequenceName = "empId_seq_gen", allocationSize = 1)
	@GeneratedValue(generator = "empId_seq_gen", strategy = GenerationType.SEQUENCE)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empNo;

	@Column(nullable = false, length = 50)
	private String empName;

	@Column(nullable = false, length = 50)
	private String designation;

	@Column(nullable = false)
	private Float empSalary;

}
