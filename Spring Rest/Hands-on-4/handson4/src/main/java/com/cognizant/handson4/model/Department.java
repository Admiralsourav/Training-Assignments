package com.cognizant.handson4.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	@NotNull
	private String deptId;
	@NotNull
	@NotBlank
	@Size(min=1,max=30)
	private String deptName;
	
	
}
