package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.CountryList;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {
	

	public Country getCountry(String code) throws CountryNotFoundException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		CountryList countryList = context.getBean("conurtyList", CountryList.class);
		
		List<Country> countryList2 = countryList.getCountryList();
	
		for (Country country : countryList2) {
			
			if(country.getCode().equalsIgnoreCase(code))
				return country;
		}
		
		throw new CountryNotFoundException("Country not Found");
		
		
	}

}
