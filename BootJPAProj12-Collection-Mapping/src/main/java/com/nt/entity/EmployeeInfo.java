package com.nt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.ListIndexBase;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="EMPLOYEE_INFO_TABLE")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "e_name", length = 20, nullable = false)
	private String eName;
	
	@ElementCollection
	@CollectionTable(name = "EMPLOYEE_FRIENDS", joinColumns = @JoinColumn(name = "e_id"))
	@OrderColumn(name = "e_friend_order")
	@ListIndexBase(value = 1)
	@Column(name = "e_salary")
	private List<String> friends;
	
	@ElementCollection
	@CollectionTable(name = "EMPLOYEE_PHONE", joinColumns = @JoinColumn(name = "e_id"))
	@OrderColumn(name = "e_phone_order")
	@Column(name = "e_phone_number")
	private Set<Long> phoneNumber;
	
	@ElementCollection
	@CollectionTable(name = "EMPLOYEE_ID_DETAILS", joinColumns = @JoinColumn(name = "e_id"))
	@MapKeyColumn(name = "e_id_type")
	@Column(name = "e_id_details")
	private Map<String, String> idDetails;
}
