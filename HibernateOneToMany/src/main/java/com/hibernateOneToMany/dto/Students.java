package com.hibernateOneToMany.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Students {

	@Id
	private int id;
	
	private String name;
	
	private String email;
	
	private LocalDate dob;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Trainer_id")
	private Trainer trainer;

	
}
