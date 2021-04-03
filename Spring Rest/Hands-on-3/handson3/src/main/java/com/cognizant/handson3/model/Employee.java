package com.cognizant.handson3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private String empId;
	private String empName;
	private int salary;
	private Department dept;

}
