package com.cts.builderPattern;

public class chickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
