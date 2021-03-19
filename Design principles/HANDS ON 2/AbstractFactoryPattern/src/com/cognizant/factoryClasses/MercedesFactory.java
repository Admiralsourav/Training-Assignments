package com.cognizant.factoryClasses;

import com.cognizant.AbstractClasses.Factory;
import com.cognizant.AbstractClasses.Headlight;
import com.cognizant.AbstractClasses.Tire;

public class MercedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		System.out.println("Mercedes Headlight");
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		System.out.println("Mercedes Tire");
		return new MercedesTire();
	}

}
