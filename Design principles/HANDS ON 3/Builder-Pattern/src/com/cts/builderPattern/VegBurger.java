package com.cts.builderPattern;

public class VegBurger extends Burger {

	
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
