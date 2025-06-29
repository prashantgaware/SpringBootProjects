package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonInfo;
import com.nt.repo.IPersonRepo;

@Service("personService")
public class PersonService implements IPersonService {
	
	@Autowired
	private IPersonRepo repo;

	@Override
	public String registerPersonInfo(PersonInfo info) {
		return repo.save(info).getPid() + " is saved with " + info.getPname();
	}

	@Override
	public List<PersonInfo> getAllPersons() {
		return repo.findAll();
	}

	@Override
	public PersonInfo getPersonById(int id) {
		Optional<PersonInfo> person = repo.findById(id);
		if (person.isPresent()) {
			return person.get();
		} else {
			return null;
		}
	}

	@Override
	public int getCount() {
		return (int) repo.count();
	}
}
