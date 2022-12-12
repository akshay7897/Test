package com.example.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long departmentId;
	@NotBlank(message = "departmentname may not be null ")
	private String departmentName;
	@NotBlank(message = "departmentaddress may not be null ")
	private String departmentAddress;
	@NotBlank(message = "departmentcode may not be null ")
	private String departmentCode;
	
	
	
}
