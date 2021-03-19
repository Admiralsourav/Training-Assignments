package com.cts.builderPattern;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItems(new VegBurger());
		meal.addItems(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItems(new chickenBurger());
		meal.addItems(new Pepsi());
		
		return meal;
	}
}
