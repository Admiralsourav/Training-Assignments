package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.CountryList;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

import ch.qos.logback.classic.Logger;

@RestController
public class CountryController {
	
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);


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
	
	
	
	
}
