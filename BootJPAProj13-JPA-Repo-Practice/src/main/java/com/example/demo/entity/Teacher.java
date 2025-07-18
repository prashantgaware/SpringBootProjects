package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Teacher {

	@Id
	@SequenceGenerator(
			name = "teacher_seq",
			sequenceName = "teacher_seq",
			allocationSize = 1
	)
	@GeneratedValue(
			generator = "teacher_seq",
			strategy = GenerationType.SEQUENCE
	)
	private Long teacherId;
	private String firstName;
	private String lastName;
	
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(
			name = "teacher_id",
			referencedColumnName = "teacherId"
	)
	private List<Course> courses;*/
}
