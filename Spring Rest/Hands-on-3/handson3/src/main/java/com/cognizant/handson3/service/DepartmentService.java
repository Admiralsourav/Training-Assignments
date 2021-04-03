package com.cognizant.handson3.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.handson3.dao.DepartmentDao;
import com.cognizant.handson3.model.Department;

@Service
public class DepartmentService {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
	private static DepartmentDao departmentDao = context.getBean("departmentList", DepartmentDao.class);
	
	
	public List<Department> getAllDepartments(){
		return departmentDao.getAllDepartments();
	}
	
	
}
