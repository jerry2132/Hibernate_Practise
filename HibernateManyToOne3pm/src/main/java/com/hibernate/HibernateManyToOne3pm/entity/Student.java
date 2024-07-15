package com.hibernate.HibernateManyToOne3pm.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone;
	
	@CreationTimestamp
	private LocalDateTime registerDateTime;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ClassRoom classRoom;
	
	

	public Student(String name, String email, long phone, ClassRoom classRoom) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.classRoom = classRoom;
	}


	
	
}