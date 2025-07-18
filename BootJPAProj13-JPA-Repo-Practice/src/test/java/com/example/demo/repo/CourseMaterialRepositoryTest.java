package com.example.demo.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseMaterial;

@SpringBootTest
class CourseMaterialRepositoryTest {
	
	@Autowired
	private CourseMaterialRepository courseMaterialRepo;

	@Test
	public void saveCourseMaterial() {
		Course course = Course.builder()
				.courseName("DSA")
				.courseCredit(6)
				.build();
		
		CourseMaterial courseMaterial = CourseMaterial.builder()
				.url("google.com")
				.course(course)
				.build();
		
		CourseMaterial cm = courseMaterialRepo.save(courseMaterial);
		System.out.println(cm);
		
	}
	
	@Test
	public void getCourseMaterial() {
		System.out.println(courseMaterialRepo.findAll());
	}
	
	@Test
	public void getCourseMCount() {
		System.out.println(courseMaterialRepo.count());
	}

}
