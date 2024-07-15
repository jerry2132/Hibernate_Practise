package com.ManyToManyBidirectional.enity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
public class Student {

	@Id
	private int id;
	
	private String name ;
	
	private String email;
	
	private long phone;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( name = "Student_subject_mapping",
			joinColumns = @JoinColumn(name ="Student_Id"),
			inverseJoinColumns = @JoinColumn(name = "Subject_Id")
			)
	List<Subject> subject;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}
