package com.ManyToOneUnidirectional.entity;



import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {

	@Id
	private int unviersityId;
	
	private String name ;
	
	private String address;
	
	
}
