package com.example.demo.repo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Course;
import com.example.demo.entity.Teacher;

@SpringBootTest
class TeacherRepositoryTest {
	
	@Autowired
	private TeacherRepository teacherRepo;

	@Test
	public void saveTeacher() {
		Teacher teacher = Teacher.builder()
				.firstName("Johnny")
				.lastName("Diddy")
//				.courses(listOfCourses())
				.build();
		
		var t = teacherRepo.save(teacher);
		
		System.out.println(t);
	}
	
	@Test
	public void getTeachers() {
		List<Teacher> ts = teacherRepo.findAll();
		System.out.println(ts);
	}
	
	@Test
	public void getTeachersCount() {
		System.out.println(teacherRepo.count());
	}
	
	private List<Course> listOfCourses() {
		Course course1 = Course.builder()
				.courseName("Java")
				.courseCredit(4)
				.build();
		Course course2 = Course.builder()
				.courseName("Python")
				.courseCredit(3)
				.build();
		Course course3 = Course.builder()
				.courseName("JavaScript")
				.courseCredit(2)
				.build();
		return List.of(course1, course2, course3);
	}

}
