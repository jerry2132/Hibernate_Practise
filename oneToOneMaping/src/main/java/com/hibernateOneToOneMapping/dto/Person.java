package com.hibernateOneToOneMapping.dto;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



//import com.hibernateCRUDOerations.dto.Student;

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
public class Person {


	@Id
	private int id;
	
	private String name;
	
	private String email;
	
	private long phone;
	
	@OneToOne(cascade = {CascadeType.PERSIST , CascadeType.MERGE})
	@JoinColumn(name = "adhaarNumber")
	private Adhaar adhaar;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

	


	
	
}
