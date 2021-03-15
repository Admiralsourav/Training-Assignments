package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;

	@Transactional
	public List<Country> getAllCountries() {
		List<Country> country = countryRepository.findAll();
		return country;
	}

	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
		// TODO Auto-generated method stub
		Optional<Country> result = countryRepository.findById(countryCode);

		if (!result.isPresent()) {
			throw new CountryNotFoundException("Country not found");

		} else {
			Country country = result.get();
			return country;
		}
	}

	public void addCountry(Country country) throws CountryNotFoundException {
		Country save = countryRepository.save(country);

		if (save == null) {
			throw new CountryNotFoundException("Unable to add country to database");
		}
	}

	@Transactional
	public void updateCountry(String code, String name) throws CountryNotFoundException {

		Optional<Country> findById = countryRepository.findById(code);

		if (findById != null) {
			Country country = new Country();

			country.setCode(code);
			country.setName(name);

			countryRepository.save(country);
		} else {
			throw new CountryNotFoundException("There is not coutry with such details");

		}

	}
	
	@Transactional
	public void deleteCountry(String code) {
		countryRepository.deleteById(code);
	}

}
