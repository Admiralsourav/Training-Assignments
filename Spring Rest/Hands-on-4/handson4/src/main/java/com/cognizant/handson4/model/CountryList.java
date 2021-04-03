package com.cognizant.handson4.model;

import java.util.List;

public class CountryList {
	private List<Country> countryList;
	
	

	public CountryList() {
		super();
	}

	public CountryList(List<Country> countryList) {
		super();
		this.countryList = countryList;
	}

	public List<Country> getCountryList() {
		return countryList;
	}
	
	public void addCountry(Country country) {
		countryList.add(country);
	}

	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}

	@Override
	public String toString() {
		return "CountryList [countryList=" + countryList + "]";
	}
	
	
}
