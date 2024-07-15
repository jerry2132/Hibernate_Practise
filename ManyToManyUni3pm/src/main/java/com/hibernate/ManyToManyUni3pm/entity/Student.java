package com.hibernate.ManyToManyUni3pm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

	
	@Id
	@GeneratedValue
	private int id;
	
	 private String name;
	
	 private String email;
	
	private long phone;
	
	@Lob
	private byte[] image;
	
	@ManyToMany(cascade = CascadeType.ALL)	
	private List<Subject> subject;

	public Student(String name, String email, long phone, byte[] image, List<Subject> subject) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.image = image;
		this.subject = subject;
	}
	
	
	
}
