package com.hibernate.ManyToManyUni3pm.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Subject {

	
	@Id
	@GeneratedValue
	private int id; 

	private String name ;
	
	private String author;
	
	private long price;

	@ManyToMany(mappedBy = "subject")
	List<Student> student;
	
	public Subject(String name, String author, long price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	
}