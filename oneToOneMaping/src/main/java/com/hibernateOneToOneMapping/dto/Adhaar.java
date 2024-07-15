package com.hibernateOneToOneMapping.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
public class Adhaar {

	
	
	@Id
	private long adhaarNumber;
	
	private LocalDate dob;
	
	private String address;
	
	private String fatherName;
	
	@OneToOne(mappedBy = "adhaar")
//	@JoinColumn(name  = "personId")
	private Person person;

	@Override
	public String toString() {
		return "Adhaar [adhaarNumber=" + adhaarNumber + ", dob=" + dob + ", address=" + address + ", fatherName="
				+ fatherName + "]";
	}
	
	
	
}
