package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {
	
	
	private static CountryService countryService;
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

	public static void main(String[] args) throws CountryNotFoundException {

		//SpringApplication.run(OrmLearnApplication.class, args);

		LOGGER.info("Inside main");

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);
		
		testGetAllCountries();
		
		getAllCountriesTest();
		
		//testAddCountry();
		
		testUpdateCountry();

		testDeleteCountry();
	}
}
