package com.cognizant.ormlearn;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;
import com.cognizant.ormlearn.service.exception.EmployeeNotFoundException;

@SpringBootApplication
@ComponentScan("com.*")
public class OrmLearnApplication {
	
	
	private static CountryService countryService;
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);


	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();
		

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

	}
	
	private static void getAllCountriesTest() throws CountryNotFoundException {

		LOGGER.info("Start");

		Country country = countryService.findCountryByCode("IN");

		LOGGER.debug("Country:{}", country);

		LOGGER.info("End");

		}
	
	private static void testAddCountry() throws CountryNotFoundException {
		
		LOGGER.info("Start adding country");
		
		Country country = new Country();
		country.setCode("SO");
		country.setName("Sourav");
		
		CountryService countryService2 = countryService;
		countryService2.addCountry(country);
		
		LOGGER.debug("countryService2:{}", country);
		
		LOGGER.info("End");
		
	}
	
	private static void testUpdateCountry() throws CountryNotFoundException {
		LOGGER.info("Start update country");
		
		CountryService countryService2 = countryService;
		countryService2.updateCountry("SO", "Gourav");
		
		LOGGER.info("end");
	}
	
	private static void testDeleteCountry() {
		LOGGER.info("Start");
		countryService.deleteCountry("LK");
		LOGGER.info("end");
	}
	
	
	
	private static void testFindByNameLike() {
		LOGGER.info("Start testing find by name method");
		List<Country> countryList = countryService.findByNameLike("%ou%");
		LOGGER.debug("countries={}", countryList);
		LOGGER.info("end");
	}
	
	private static void testGetEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(2);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.info("End");
	}
	
	private static void testAddEmployee() {
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Gourav");
		employee.setDateOfBirth(new Date(1998,01,27));
		employee.setPermanent(false);
		employee.setSalary(25825.0);
		
		Department department = new Department();
		department.setId(101);
		department.setName("CSE");
		
		
		employee.setDepartment(department);
		
		employeeService.save(employee);
	}
	private static void testUpdateEmployee() throws EmployeeNotFoundException{
		
		LOGGER.info("Start");
		Employee emp = employeeService.get(2);
		
		if(emp != null) {
			emp.setName("Gourav Kumar");
			emp.setSalary(32000.25);
			
			employeeService.save(emp);
			
			LOGGER.debug("Employee:{}", emp);
			LOGGER.debug("Department:{}", emp.getDepartment());
			LOGGER.info("End");
		}else {
			throw new EmployeeNotFoundException("Employee deosn't exist");
		}
		
	}
	
	private static void testGetDepartment() {
		LOGGER.info("Start");
		Department dept = departmentService.get(101);
		Set<Employee> employeeList = dept.getEmployeeList();
		
		LOGGER.debug("Employee:{}", employeeList);
	}
	
	private static void testAddSkillToEmployee() {
		
		LOGGER.info("Start");
		Employee emp = employeeService.get(2);
		
		Skill skill = skillService.get(201);
		Set<Employee> employeeList = new HashSet<Employee>();
		employeeList.add(emp);
		skill.setEmployeeList(employeeList);
		
		
		Set<Skill> skillSet = new HashSet<Skill>();
		skillSet.add(skill);
		
		emp.setSkillList(skillSet);
		
		employeeService.save(emp);
		
	}

	public static void main(String[] args) throws CountryNotFoundException, EmployeeNotFoundException {

		//SpringApplication.run(OrmLearnApplication.class, args);

		LOGGER.info("Inside main");

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);
		
		employeeService = context.getBean(EmployeeService.class);
		
		departmentService = context.getBean(DepartmentService.class);
		
		skillService = context.getBean(SkillService.class);
		
		//testGetAllCountries();
		
		//getAllCountriesTest();
		
		//testAddCountry();
		
		//testUpdateCountry();

		//testDeleteCountry();
		
		//testFindByNameLike();
		
		//testGetEmployee();
		
		//testAddEmployee();
		
		//testUpdateEmployee();
		
		//testGetDepartment();
		
		//testAddSkillToEmployee();
		
		//testAllPermanentEmployees();
		
		//testGetAverageSalary();
		
		//testGetAverageSalaryAsPerDepartment();
		
		testAllEmployeeNative();
	}

	private static void testAllEmployeeNative() {
		LOGGER.info("Start");
		List<Employee> nativeQuery = employeeService.nativeQuery();
		LOGGER.debug("Employee nativeQuery:{}", nativeQuery);
		LOGGER.info("END");
	}

	//Below this all the methods are mentioned in hands on 3
	
	private static void testGetAverageSalaryAsPerDepartment() {
		LOGGER.info("STARTING>>>>>>>>>>>>>>");
		double averageSalaryAsPerDepartment = employeeService.getAverageSalaryAsPerDepartment(101);
		LOGGER.debug("Employee getAverageSalaryAsPerDepartment : " , averageSalaryAsPerDepartment);
		LOGGER.info("END.......");
	}

	
	private static void testGetAverageSalary() {
		LOGGER.info("Start Average Salary Test");
		double averageSalary = employeeService.getAverageSalary();
		LOGGER.debug("Average Salary:", averageSalary);
		LOGGER.info("End the Testing");
	}

	private static void testAllPermanentEmployees() {
		LOGGER.info("Start testing All permanent Employees");
		List<Employee> employees = employeeService.getAllPermanentEmployees();
		LOGGER.debug("Permanent Employees:{}",employees);
		employees.forEach(e->LOGGER.debug("Skills:{}",e.getSkillList()));
		LOGGER.info("End");
		
	}

	


}
