package com.example.demo.repo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Guardian;
import com.example.demo.entity.Student;

@SpringBootTest
class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository studentRepo;

	@Test
	public void saveStudent() {
		Guardian guardian = Guardian.builder().name("Jack").email("jack@gmail.com").mobile("88888888").build();

		Student student = Student.builder().firstName("John").lastName("Doe").studentEmail("jd@g.com")
				.mobile("9999999999").guardian(guardian).build();

		var s = studentRepo.save(student);
		System.out.println(s);
	}
	
	@Test
	public void findAllStudents() {
		List<Student> students = studentRepo.findAll();
		System.out.println(students);
	}
	
	@Test
	public void findStudentById() {
		System.out.println(studentRepo.findById(1L));
	}

}
