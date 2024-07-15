package com.hibernate.hibernatOneToOne.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	
	private int id;
	
	private String name;
	
	private String email;
	
	private long phone;
	
	private double salary;
	
	private LocalDate dob;
	
	private LocalDate doj;
	
	
}
