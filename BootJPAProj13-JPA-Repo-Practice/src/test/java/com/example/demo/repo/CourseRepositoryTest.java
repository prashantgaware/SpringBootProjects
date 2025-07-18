package com.example.demo.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseMaterial;
import com.example.demo.entity.Teacher;

@SpringBootTest
class CourseRepositoryTest {
	
	@Autowired
	private CourseRepository courseRepo;

	@Test
	public void saveCourseMaterial() {
		
	}
	
	@Test
	public void saveCourseWithTeacher() {
		 Teacher teacher = Teacher.builder()
	                .firstName("Shikha")
	                .lastName("Hiwase")
	                .build();
	        
	        Course course = Course.builder()
	                .courseName("DBDA")
	                .courseCredit(4)
	                .teacher(teacher)
	                .build();

	        // You are creating a CourseMaterial that BELONGS TO the course.
	        CourseMaterial courseMaterial = CourseMaterial.builder()
	                .url("www.gfg.com")
	                // CRITICAL STEP 1: Set the owning side reference
	                .course(course)
	                .build();

	        // CRITICAL STEP 2: Set the inverse side reference
	        course.setCourseMaterial(courseMaterial);

	        // Now, when you save the course, cascading will correctly persist
	        // the fully-linked Teacher and CourseMaterial objects.
	        courseRepo.save(course);
	        
	        System.out.println("Data saved successfully!");
	}
	
	
	@Test
	public void getCourseCount() {
		System.out.println(courseRepo.count());
	}
	
	@Test
	public void findCourse() {
		System.out.println(courseRepo.findAll());
	}

}
