package com.cognizant.handson4.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.handson4.model.Employee;
import com.cognizant.handson4.service.EmployeeService;

@RestController
public class EmployeeController {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PutMapping("/employees")
	public void updateEmployee(@RequestBody @Valid Employee employee)
	{
		LOGGER.info("Started");
		employeeService.updateEmployee(employee);
		LOGGER.debug("Employees : {}",employeeService.getAllEmployees());
		LOGGER.info("End");
	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		LOGGER.info("Started");
		employeeService.deleteEmployee(id);
		LOGGER.debug("Employees : {}",employeeService.getAllEmployees());
		LOGGER.info("End");
		
	}
}
