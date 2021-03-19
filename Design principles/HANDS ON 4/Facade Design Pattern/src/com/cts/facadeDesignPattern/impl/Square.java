package com.cts.facadeDesignPattern.impl;

import com.cts.facadeDesignPattern.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {

		System.out.println("Drawing Square");
	}

}
