package com.cognizant.handson3.dao;

import java.util.List;

import com.cognizant.handson3.model.Department;

public class DepartmentDao {

	private static List<Department> DEPARTMENT_LIST;

	public static List<Department> getDEPARTMENT_LIST() {
		return DEPARTMENT_LIST;
	}
	
	public List<Department> getAllDepartments(){
		return DEPARTMENT_LIST;
	}

	public static void setDEPARTMENT_LIST(List<Department> dEPARTMENT_LIST) {
		DEPARTMENT_LIST = dEPARTMENT_LIST;
	}
	
	public DepartmentDao() {
		super();
	}
	
	public DepartmentDao(List<Department> DEPARTMENT_LIST) {
		this.DEPARTMENT_LIST = DEPARTMENT_LIST;
	}

	@Override
	public String toString() {
		return "DepartmentDao []";
	}
	
	
	
}
