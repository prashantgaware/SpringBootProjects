package com.nt.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "emp")
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private int empno;

	@NonNull
    private String ename;

	@NonNull
    private String job;

	@NonNull
    private Integer mgr;

	@NonNull
    private LocalDate hiredate;

	@NonNull
    private BigDecimal sal; 

	@NonNull
    private BigDecimal comm;

	@NonNull
    private Integer deptno;
}
