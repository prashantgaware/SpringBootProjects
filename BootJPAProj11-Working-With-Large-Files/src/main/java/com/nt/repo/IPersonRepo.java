package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PersonInfo;

public interface IPersonRepo extends JpaRepository<PersonInfo, Integer> {

}
