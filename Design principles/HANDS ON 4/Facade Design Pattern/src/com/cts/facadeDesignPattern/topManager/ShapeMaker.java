package com.cts.facadeDesignPattern.topManager;

import com.cts.facadeDesignPattern.impl.Circle;
import com.cts.facadeDesignPattern.impl.Rectangle;
import com.cts.facadeDesignPattern.impl.Square;
import com.cts.facadeDesignPattern.interfaces.Shape;

public class ShapeMaker {

	private Shape shapeCircle;
	private Shape shapeRectangle;
	private Shape shapeSquare;
	
	public ShapeMaker() {
		shapeCircle = new Circle();
		shapeRectangle = new Rectangle();
		shapeSquare = new Square();
	}
	
	public void getCircle() {
		shapeCircle.draw();
	}
	
	public void getRectangle() {
		shapeRectangle.draw();
	}
	
	public void getSquare() {
		shapeSquare.draw();
	}
	
}
