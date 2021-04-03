package com.cognizant.springlearn;

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

	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}

	@Override
	public String toString() {
		return "CountryList [countryList=" + countryList + "]";
	}
	
	
}
