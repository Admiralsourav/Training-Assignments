package com.cognizant.client;

import com.cognizant.AbstractClasses.Factory;
import com.cognizant.AbstractClasses.Headlight;
import com.cognizant.AbstractClasses.Tire;
import com.cognizant.factoryClasses.AudiFactory;
import com.cognizant.factoryClasses.MercedesFactory;

public class Client {

	public static Headlight getHeadlight(Factory factory) {
		return factory.makeHeadlight();
	}

	public static Tire getTire(Factory factory) {
		return factory.makeTire();
	}

	public static void main(String[] args) {

		Headlight headlightAudi = Client.getHeadlight(new AudiFactory());
		Tire tireAudi = Client.getTire(new AudiFactory());

		Headlight headlightMercedes = Client.getHeadlight(new MercedesFactory());
		Tire tireMercedes = Client.getTire(new MercedesFactory());
	}

}
