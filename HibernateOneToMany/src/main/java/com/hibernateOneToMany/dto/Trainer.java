package com.hibernateOneToMany.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trainer {

	@Id
	private int id;
	
	private String name;
	
	private String email;
	
	private long phone ;
	
	private LocalDate dob;
	
	private String specialization;
	
	@OneToMany(mappedBy = "trainer")
	//@JoinColumn(name ="student_id")
	List<Students> students;
}
