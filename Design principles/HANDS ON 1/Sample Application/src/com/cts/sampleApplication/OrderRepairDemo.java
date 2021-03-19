package com.cts.sampleApplication;

import java.util.Scanner;

public class OrderRepairDemo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption = sc.next();
		PhoneOrderRepair phoneOrderRepair = new PhoneOrderRepair();
		String productDetail = "";
		switch (processOption) {
		case "order":
			System.out.println("Please Provide the phone model name");
			productDetail = sc.next();
			phoneOrderRepair.processOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accesssory that you want to be repaired?");
			String productType = sc.next();
			if (productType.equalsIgnoreCase("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail = sc.next();
				System.out.println(productDetail);

				phoneOrderRepair.processPhoneRepair(productDetail);
				break;

			} else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.next();
				phoneOrderRepair.processAccessoryRepair(productDetail);
				
			}
			break;
		default:
			break;
		}
		sc.close();
	}
}
