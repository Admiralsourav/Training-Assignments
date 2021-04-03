package com.cognizant.handson3.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.handson3.dao.EmployeeDao;
import com.cognizant.handson3.model.Employee;

@Service
public class EmployeeService {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
	private static EmployeeDao employeeDao = context.getBean("employeeList", EmployeeDao.class);
	
	
	public List<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}
	
	
	
}
