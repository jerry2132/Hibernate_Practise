package com.hibernate.OneToOne3PM.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Capital {

	@Id
	private int id;
	private String name; 
	private long population;
	private int noDistrict;
	
}
