package com.ManyToManyBidirectional.enity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

	@Id
	private int id;
	
	private String name;
	
	private String authorname;
	
	private LocalDate publishedYear;
	
	private long price;
	
	@ManyToMany(mappedBy = "subject")
	List<Student> student;

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", authorname=" + authorname + ", publishedYear="
				+ publishedYear + ", price=" + price + "]";
	}
	
	
}
