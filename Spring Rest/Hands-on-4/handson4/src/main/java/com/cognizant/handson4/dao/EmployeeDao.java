package com.cognizant.handson4.dao;

import java.util.Iterator;
import java.util.List;

import com.cognizant.handson4.model.Employee;

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
	
	public void UpdateEmployee(Employee employee) {
		for (Employee emp : EMPLOYEE_LIST) {
			if (emp.getEmpId().equalsIgnoreCase(employee.getEmpId())) {
				emp.setSalary(employee.getSalary());
			}
		}
	}

	public void deleteEmployee(String id) {
		Iterator<Employee> iterator = EMPLOYEE_LIST.iterator();
		while (iterator.hasNext()) {
			Employee emp = (Employee) iterator.next();
			if (emp.getEmpId().equalsIgnoreCase(id)) {
				iterator.remove();
			}
		}
	}
	
	
	
}
