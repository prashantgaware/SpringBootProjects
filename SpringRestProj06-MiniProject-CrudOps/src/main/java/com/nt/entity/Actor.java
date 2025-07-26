package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "rest_actor")
public class Actor {

	@Id
	@SequenceGenerator(name = "actor_id_seq", allocationSize = 1, sequenceName = "actor_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actor_id_seq")
	private Long id;

	@Column(name = "actor_name", nullable = false, length = 20)
	private String name;

	@Column(name = "actor_category", nullable = false, length = 20)
	private String category;

	@Column(name = "actor_mobile", nullable = false, length = 10, unique = true)
	private Long mobile;

}
