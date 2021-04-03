package com.cognizant.handson4.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.handson4.model.Country;
import com.cognizant.handson4.model.CountryList;
import com.cognizant.handson4.service.CountryService;
import com.cognizant.handson4.service.exception.CountryNotFoundException;


@RestController
public class CountryController {
	
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	
	@Autowired
	private CountryService countryService;

	@RequestMapping("/country")
	public Country getCountryIndia() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		LOGGER.info("Start");
		Country country = context.getBean("country", Country.class);
		LOGGER.debug("End");
		return country;
	}
	
	@RequestMapping("/countries")
	public CountryList getAllCountries(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		LOGGER.info("Starting the get all countries method");
		CountryList listCountry = (CountryList) context.getBean("countryList", CountryList.class);
		LOGGER.info("END");
		return listCountry;
	}
	
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		LOGGER.info("Starting the get all countries method");
		CountryList listCountry = (CountryList) context.getBean("countryList", CountryList.class);
		List<Country> countryList = listCountry.getCountryList();
		for (Country country : countryList) {
			if(country.getCode().equalsIgnoreCase(code))
				return country;
		}
		
		throw new CountryNotFoundException("Country Not Found");
	}
	
	
	@PostMapping("/countries")
	public void addCountry(@RequestBody @Valid Country country) {
		LOGGER.info("Trying to add country");
		countryService.addCountry(country);
		LOGGER.debug("END");
	}
	
	
	
}
