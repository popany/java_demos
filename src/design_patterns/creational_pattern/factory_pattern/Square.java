package design_patterns.creational_pattern.factory_pattern;

public class Square implements Shape {
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}