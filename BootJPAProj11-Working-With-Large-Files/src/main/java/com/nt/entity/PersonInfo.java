package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="person_info")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class PersonInfo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	
	private LocalDateTime dob;
	
	@NonNull
	private boolean married;
	
	@Lob
	private byte[] photo;
	
	private String pname;
	
	@Lob
	private char[] resume;
	
}
