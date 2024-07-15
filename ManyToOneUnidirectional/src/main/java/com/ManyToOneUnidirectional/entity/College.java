package com.ManyToOneUnidirectional.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {

	@Id
	private int collegeId;
	
	private String name;
	
	private String address;
	
	private String type;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private University university;
	
}
