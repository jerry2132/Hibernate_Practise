package com.hibernate.HibernateManyToOne3pm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClassRoom {

	@Id
	private int number;
	private int strength;
	private String floor;
	
	private String section;
}