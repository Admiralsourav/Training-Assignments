package com.cognizant.factoryClasses;

import com.cognizant.AbstractClasses.Factory;
import com.cognizant.AbstractClasses.Headlight;
import com.cognizant.AbstractClasses.Tire;

public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		System.out.println("Audi headlight");
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		System.out.println("Audi Tire");
		return new AudiTire();
	}

}
