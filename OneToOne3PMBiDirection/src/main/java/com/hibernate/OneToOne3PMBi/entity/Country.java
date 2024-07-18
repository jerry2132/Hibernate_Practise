package com.hibernate.OneToOne3PMBi.entity;

import javax.persistence.CascadeType;
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
public class Country {

	
	@Id
	private int id; 
	private String name;
	private long population;
	private int no_Seats;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Capital capital;

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", population=" + population + ", no_Seats=" + no_Seats + "]";
	}
	
	
}
