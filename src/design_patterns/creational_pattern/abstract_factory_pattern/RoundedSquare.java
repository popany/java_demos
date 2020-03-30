package design_patterns.creational_pattern.abstract_factory_pattern;

import design_patterns.creational_pattern.factory_pattern.Shape;

public class RoundedSquare implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}
}
