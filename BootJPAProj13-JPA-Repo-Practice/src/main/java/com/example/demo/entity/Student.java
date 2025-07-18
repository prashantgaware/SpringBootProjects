package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(
		name = "tbl_student",
		uniqueConstraints = @UniqueConstraint(
				name = "emailId_unique",
				columnNames = "student_email_address"
		)
)
public class Student {
	
	@Id
	@SequenceGenerator(
			name = "student_seq",
			sequenceName = "student_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_seq"
	)
	private Long studentId;
	private String firstName;
	private String lastName;
	
	@Column(
			name = "student_email_address",
			nullable = false
	)
	private String studentEmail;
	@Embedded
	private Guardian guardian;
	private String mobile;

}
