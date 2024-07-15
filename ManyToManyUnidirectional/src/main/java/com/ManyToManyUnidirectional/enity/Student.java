package com.ManyToManyUnidirectional.enity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	private int id;
	
	private String name ;
	
	private String email;
	
	private long phone;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sub_id")
	List<Subject> subject;
}
