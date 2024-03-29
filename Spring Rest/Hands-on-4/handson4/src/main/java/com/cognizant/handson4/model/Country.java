package com.cognizant.handson4.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);


	@NotNull
	@Size(min = 2, max = 2, message = "Country code should be 2 characters")
	String code;
	private String name;
	
	public Country() {
		super();
		LOGGER.info("Inside Country Constructor");
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
	
	
}
