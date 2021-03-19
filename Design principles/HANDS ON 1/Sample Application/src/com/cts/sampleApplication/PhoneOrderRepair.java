package com.cts.sampleApplication;

public class PhoneOrderRepair implements IorderRepair{
	public void processOrder(String modelName) {

		System.out.println("Order Accepted " + modelName);
	}

	public void processPhoneRepair(String modelName) {

		System.out.println("Repair Accepted " + modelName);
	}

	public void processAccessoryRepair(String accessoryType) {

		System.out.println("Repair Accepted " + accessoryType);

	}
}
