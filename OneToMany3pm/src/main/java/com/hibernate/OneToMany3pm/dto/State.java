package com.hibernate.OneToMany3pm.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name= "St_dist",
	joinColumns=@JoinColumn(name="st_id"),
	inverseJoinColumns=@JoinColumn(name="dist_id"))
	Set<District> district;

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", capitalName=" + capitalName + ", noOfDistrict=" + noOfDistrict
				+ "]";
	}
	
	
	
}
