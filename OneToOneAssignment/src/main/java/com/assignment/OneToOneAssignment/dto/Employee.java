package com.assignment.OneToOneAssignment.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private int id;
	
	private String name;
	
	private LocalDate dob;
	
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;
	
	
	
}
