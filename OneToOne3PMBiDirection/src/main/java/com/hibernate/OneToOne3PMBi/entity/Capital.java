package com.hibernate.OneToOne3PMBi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Capital {

	@Id
	private int id;
	private String name; 
	private long population;
	private int noDistrict;
	
	@OneToOne(mappedBy = "capital")
	private Country country;

	@Override
	public String toString() {
		return "Capital [id=" + id + ", name=" + name + ", population=" + population + ", noDistrict=" + noDistrict
				+ "]";
	}
	
	
	
}
