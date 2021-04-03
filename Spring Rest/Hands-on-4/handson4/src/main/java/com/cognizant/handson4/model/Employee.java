package com.cognizant.handson4.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@NotNull(message="Cannot Be NULL")
	private String empId;
	
	@NotNull(message="Cannot Be NULL")
	@NotBlank(message="Cannot Be NULL")
	@Size(min=1,max=30,message="Size Crossed")
	private String empName;
	@NotNull(message="Cannot Be NULL")
	private int salary;
	private Department dept;

}
