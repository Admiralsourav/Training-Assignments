package com.cognizant.handson4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.handson4.model.Department;
import com.cognizant.handson4.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments(){
		return deptService.getAllDepartments();
	}
	
}
