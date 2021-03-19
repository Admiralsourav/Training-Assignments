package com.cts.facadeDesignPattern;

import com.cts.facadeDesignPattern.topManager.ShapeMaker;

public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.getCircle();
		shapeMaker.getRectangle();
		shapeMaker.getSquare();
	}
}
