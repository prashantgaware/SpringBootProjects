package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.EmployeeInfo;

public interface IEmployeeRepo extends JpaRepository<EmployeeInfo, Integer> {

}
