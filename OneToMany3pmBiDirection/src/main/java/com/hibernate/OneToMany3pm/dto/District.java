package com.hibernate.OneToMany3pm.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class District {

	@Id
	private int id;
	
	private String name;
	
	private long  population;
	
	private LocalDate establishedYear;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private State state;
}
