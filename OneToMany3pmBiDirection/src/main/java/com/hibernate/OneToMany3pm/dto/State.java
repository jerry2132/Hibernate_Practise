package com.hibernate.OneToMany3pm.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class State {

	
	@Id
	private int id;
	
	private String name;
	
	private String capitalName;
	
	private int noOfDistrict;
	
	@OneToMany(mappedBy = "state")
	Set<District> district;

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", capitalName=" + capitalName + ", noOfDistrict=" + noOfDistrict
				+ "]";
	}
	
	
	
}

/*
fetch = FetchType.LAZY
tells the hibernate  t fetch the related entities from the database when programmer use has-a relationship .this is a good idea in general because
there is no  reason to select entity which programmer does not want to 

fetch = FecthType.EAGER
tells hibernate to get alll the elements of a relationship entities when prorammer trying to display root entity.

default fetch type for mapping annotation 
oone2one eager
one2many lazy
many2one eager
many2many lazy

*/
