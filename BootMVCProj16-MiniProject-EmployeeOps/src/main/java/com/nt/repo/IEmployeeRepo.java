package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {

}
