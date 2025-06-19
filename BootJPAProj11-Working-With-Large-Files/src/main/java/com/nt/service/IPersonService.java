package com.nt.service;

import java.util.List;

import com.nt.entity.PersonInfo;

public interface IPersonService {
	
	String registerPersonInfo(PersonInfo info);
	
	List<PersonInfo> getAllPersons();
	
	PersonInfo getPersonById(int id);
	
	int getCount();

}
