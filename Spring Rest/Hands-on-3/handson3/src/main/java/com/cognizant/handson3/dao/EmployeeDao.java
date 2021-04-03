package com.cognizant.handson3.dao;

import java.util.List;

import com.cognizant.handson3.model.Employee;

public class EmployeeDao {

	private static List<Employee> EMPLOYEE_LIST;

	public static List<Employee> getEMPLOYEE_LIST() {
		return EMPLOYEE_LIST;
	}

	public static void setEMPLOYEE_LIST(List<Employee> eMPLOYEE_LIST) {
		EMPLOYEE_LIST = eMPLOYEE_LIST;
	}
	
	public EmployeeDao() {
		super();
	}

	public EmployeeDao(List<Employee> EMPLOYEE_LIST) {
		this.EMPLOYEE_LIST = EMPLOYEE_LIST;
	}
	
	public List<Employee> getAllEmployees(){
		return EMPLOYEE_LIST;
	}
	
	
	
}
