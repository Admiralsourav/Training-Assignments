package com.cts.dependencyInterval;

public class PhoneDemo {
	public static void main(String[] args) {
		Redmi7 redmi = new Redmi7();
		SamsungNote samsung = new SamsungNote();
		
		System.out.println("For Redmi Phone");
		RepairSteps(redmi);
		
		System.out.println("For Samsung Phone");
		RepairSteps(samsung);
	}
	public static void RepairSteps(Iphone phone)
	{
		String part1 = phone.getPhonePart1();
		System.out.println(part1 + " repaired");
		
		double partCost = phone.getPart1Cost();
		System.out.println("Repair cost " + (partCost * 0.5));
	}
}
