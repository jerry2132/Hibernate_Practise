package com.assignment.OneToOneAssignment.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
	
	@Id
	private int id;
	
	 @NotNull(message = "name can not be null")
	 private String name;
	
	 @NotNull(message = "price can not be null")
	private long price;
	
	 @NotNull(message = "manufacturing  can not be null")
	private String manufacturedBy;

}
