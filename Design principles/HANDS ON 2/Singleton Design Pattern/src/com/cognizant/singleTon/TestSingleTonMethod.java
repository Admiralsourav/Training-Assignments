package com.cognizant.singleTon;

public class TestSingleTonMethod {

	public static void main(String[] args) {
		
		DBConn obj1 = DBConn.getInstance();
		DBConn obj2 = DBConn.getInstance();
		
		System.out.println(obj2.hashCode() == (obj1.hashCode()));

		
	}
}
