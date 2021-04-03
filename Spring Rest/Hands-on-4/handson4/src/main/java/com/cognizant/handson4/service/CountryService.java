package com.cognizant.handson4.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.handson4.model.Country;
import com.cognizant.handson4.model.CountryList;
import com.cognizant.handson4.service.exception.CountryNotFoundException;


@Service
public class CountryService {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	private static CountryList countryList = context.getBean("countryList", CountryList.class);


	public Country getCountry(String code) throws CountryNotFoundException {
		
		List<Country> countryList2 = countryList.getCountryList();
	
		for (Country country : countryList2) {
			
			if(country.getCode().equalsIgnoreCase(code))
				return country;
		}
		
		throw new CountryNotFoundException("Country not Found");	
	}


	public void addCountry(Country country) {
		
		if(country != null) {
			countryList.addCountry(country);
		}
	}

}
